package com.example.spring_data_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOEmployee {
    private Long id;
    private String name;

    private DTODepartment department;
}
