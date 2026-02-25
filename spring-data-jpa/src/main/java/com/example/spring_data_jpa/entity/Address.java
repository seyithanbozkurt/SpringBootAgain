package com.example.spring_data_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;
    @OneToOne(mappedBy = "address")// ilişkinin sahibini gösterir. mappedby'ın yazılıdığı yer sahibini kabul eden yerdir. yani burada adress customerin sahipliğini kabul ediyor. Tam tersi de olabilir.
    private Customer customer;
}
