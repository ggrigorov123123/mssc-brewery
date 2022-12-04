package com.example.msscbrewery.controller;

import com.example.msscbrewery.model.BeerDTO;
import com.example.msscbrewery.service.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/beers")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable(value = "uuid") UUID uuid){
        return new ResponseEntity<>(beerService.getBeerById(uuid), HttpStatus.OK);
    }
}
