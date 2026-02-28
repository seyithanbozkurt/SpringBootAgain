package com.example.spring_data_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DTOStudent {

    private  Integer id;
    private String firstname;
    private String lastname;
    private List<DTOCourse> courses = new ArrayList<>();
}
