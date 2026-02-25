package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.dto.DTOAddress;
import com.example.spring_data_jpa.dto.DTOCustomer;
import com.example.spring_data_jpa.entity.Address;
import com.example.spring_data_jpa.repository.AddressRepository;
import com.example.spring_data_jpa.service.IAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceimpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;
    @Override
    public DTOAddress findAddressById(Long id) {
        DTOAddress dtoAddress = new DTOAddress();
        Optional<Address> optional =addressRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }
        Address address = optional.get();
        BeanUtils.copyProperties(address,dtoAddress);

        DTOCustomer dtoCustomer = new DTOCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());
        //dtoCustomer.setDtoAddress(dtoAddress);
        dtoAddress.setDtoCustomer(dtoCustomer);
        return dtoAddress;


    }
}
