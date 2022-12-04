package com.example.msscbrewery.service;

import com.example.msscbrewery.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Georgi Grigorov")
                .build();
    }
}
