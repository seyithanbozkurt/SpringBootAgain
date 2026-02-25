package com.example.spring_data_jpa.dto;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOAddress {

    private Long id;

    private String description;

    private DTOCustomer dtoCustomer;
}
