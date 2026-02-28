package com.example.spring_data_jpa.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor                                  //String name; --> Blank
@NoArgsConstructor                                  // String name=""; -->Empty
public class DTOStudentIU {

    @NotEmpty(message = "boş bırakılamaz!")
  //  @Min(value = 3, message = "İsim alanı minimum 3 karakter olmalıdır")
   // @Max(value = 15, message = "İsim alanı maximum 15 karakter olmalıdır")
    @Size(min = 3, max = 20, message = "İsim alanı min 3 max 20 karakter olmalırdır")
    private String firstname;

    @Size(min = 3, max = 20)
    private String lastname;
    private String birthOfDate;

    @Email(message = "Email formatında bir adres giriniz.")
    private String email;

    @Size(min = 11, max = 11, message = "TCKN alanı 11 karakter olmalıdır")
    @NotEmpty(message = "TCKN alanı boş bırakılamaz.")
    private String tckn;
}
