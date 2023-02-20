package com.example.demo.service.CreateTemplate;

import com.example.demo.entity.Templates;
import com.example.demo.repository.CreateTemplateDao.CreateTemplateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class CreateTemplateServiceImpl implements CreateTemplateService {
    private final CreateTemplateDao createTemplateDao;

    @Autowired
    public CreateTemplateServiceImpl(CreateTemplateDao createTemplateDao){
        this.createTemplateDao=createTemplateDao;
    }

    @Override
    public void addTemplateService(Templates templateCreation) throws IOException {
        createTemplateDao.addTemplate(templateCreation);
    }
}
