package com.example.demo.service.CountryCode;

import com.example.demo.controller.CountryCodeController;
import com.example.demo.entity.CountryCodeProvider;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class CountryCodeServiceImpl implements CountryCodeService{

    @Override
    public List<CountryCodeProvider> fetchCountry(){
        String path = "../demo/src/main/resources/country.json";
        ObjectMapper objectMapper=new ObjectMapper();
        List<CountryCodeProvider> countryList = null;
        try {
            countryList = objectMapper.readValue(new File(path), new TypeReference<>() {});
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
        return countryList;
    }
}
