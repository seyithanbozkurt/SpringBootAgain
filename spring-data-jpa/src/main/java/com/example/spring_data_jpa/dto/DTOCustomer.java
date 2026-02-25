package com.example.spring_data_jpa.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) //boş olan null dönene değerleri göstermez.
public class DTOCustomer {
    private Long id;

    private String name;

    private DTOAddress dtoAddress;

}
