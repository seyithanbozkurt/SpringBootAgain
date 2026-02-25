package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
