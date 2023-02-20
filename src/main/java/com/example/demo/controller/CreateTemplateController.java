package com.example.demo.controller;

import com.example.demo.entity.Templates;
import com.example.demo.service.CreateTemplate.CreateTemplateService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class CreateTemplateController {

    private final CreateTemplateService createTemplateService;
    @Autowired
    public CreateTemplateController(CreateTemplateService createTemplateService){
        this.createTemplateService=createTemplateService;
    }
    @PostMapping("/createTemplate")
    public String createTemplate(@RequestBody Templates templateCreation) throws IOException {
        createTemplateService.addTemplateService(templateCreation);
        return "skr";
    }

}
