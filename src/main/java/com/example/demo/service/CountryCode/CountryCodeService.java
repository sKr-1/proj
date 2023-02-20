package com.example.demo.service.CountryCode;

import com.example.demo.entity.CountryCodeProvider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryCodeService {

    public List<CountryCodeProvider> fetchCountry();
}
