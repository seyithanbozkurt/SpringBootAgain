package com.example.spring_data_jpa.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.*;

@ControllerAdvice
public class GlobalExceptionHandler {
    private List<String> addMapValue(List<String> list, String value) {
        list.add(value);
        return list;
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        Map<String,List<String>> errosMap = new HashMap<>();

        for (ObjectError objectError : ex.getBindingResult().getAllErrors()){
            String fieldName = ((FieldError)objectError).getField();
            if (errosMap.containsKey(fieldName)){
                errosMap.put(fieldName, addMapValue(errosMap.get(fieldName), objectError.getDefaultMessage()));
            }else {
                errosMap.put(fieldName,addMapValue(new ArrayList<>(),  objectError.getDefaultMessage()));
            }
        }
        return ResponseEntity.badRequest().body(createapiError(errosMap));
    }

    private <T> ApiError createapiError(T errors){
        ApiError apiError = new ApiError();
        apiError.setId(UUID.randomUUID().toString());
        apiError.setErrorTime(new Date());
        apiError.setErrors(errors);
        return apiError;
    }

}
