package com.example.spring_data_jpa.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOHome {

    private Long id;

    private BigDecimal price;

    private List<DTORoom> rooms = new ArrayList<>();
}
