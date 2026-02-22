package com.example.spring_data_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DTOStudentIU {
    private String firstname;
    private String lastname;
    private String birthOfDate;
}
