package com.example.spring_data_jpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstname;
    @Column(name =  "last_name", nullable = false)
    private String lastname;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_of_date")
    private String birthOfDate;
}
