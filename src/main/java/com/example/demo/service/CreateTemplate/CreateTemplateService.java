package com.example.demo.service.CreateTemplate;

import com.example.demo.entity.Templates;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface CreateTemplateService {
    public void addTemplateService(Templates templateCreation) throws IOException;
}
