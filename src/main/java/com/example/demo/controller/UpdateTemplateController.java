package com.example.demo.controller;

import com.example.demo.entity.Templates;
import com.example.demo.service.UpdateTemplate.UpdateTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateTemplateController {

    private final UpdateTemplateService updateTemplateService;
    @Autowired
    public  UpdateTemplateController(UpdateTemplateService updateTemplateService){
        this.updateTemplateService=updateTemplateService;
    }

    @PutMapping("/updateTemplate")
    public void updateTemplate(@RequestBody Templates templateCreation){
        updateTemplateService.updateTemplateService(templateCreation);
    }
}
