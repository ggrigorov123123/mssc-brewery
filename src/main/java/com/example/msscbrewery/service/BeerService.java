package com.example.msscbrewery.service;

import com.example.msscbrewery.dto.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerService {

    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
