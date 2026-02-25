package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.dto.DTOAddress;
import com.example.spring_data_jpa.dto.DTOCustomer;
import com.example.spring_data_jpa.entity.Address;
import com.example.spring_data_jpa.entity.Customer;
import com.example.spring_data_jpa.repository.CustomerRepository;
import com.example.spring_data_jpa.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceimpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DTOCustomer findCustomerById(Long id) {
        DTOCustomer dtoCustomer = new DTOCustomer();
        DTOAddress dtoAddress = new DTOAddress();

       Optional<Customer> optional =  customerRepository.findById(id);
       if (optional.isEmpty()){
           return null;
       }
       Customer customer = optional.get();
       Address address = optional.get().getAddress();;

       BeanUtils.copyProperties(customer,dtoCustomer);
       BeanUtils.copyProperties(address,dtoAddress);

       dtoCustomer.setDtoAddress(dtoAddress);
       return dtoCustomer;


    }
}
