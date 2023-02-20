package com.example.demo.controller;

import com.example.demo.entity.CountryCodeProvider;
import com.example.demo.service.CountryCode.CountryCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class CountryCodeController {

    private final CountryCodeService countryCodeService;

    @Autowired
    public CountryCodeController(CountryCodeService countryCodeService){
        this.countryCodeService=countryCodeService;
    }
    @GetMapping("/getCountry")
    public List<CountryCodeProvider> getCountry(){
        return countryCodeService.fetchCountry();
    }
}
