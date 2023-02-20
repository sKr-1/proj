package com.example.demo.service.DeleteTemplate;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public interface DeleteTemplateService {
    public void deleteTemplate(String issueName);
}
