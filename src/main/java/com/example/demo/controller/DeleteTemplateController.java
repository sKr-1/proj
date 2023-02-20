package com.example.demo.controller;

import com.example.demo.service.DeleteTemplate.DeleteTemplateService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTemplateController {
    private final DeleteTemplateService deleteTemplateService;

    public DeleteTemplateController(DeleteTemplateService deleteTemplateService){
        this.deleteTemplateService=deleteTemplateService;
    }

    @DeleteMapping("/deleteTemplate/{issueName}")
    public void deleteTemplate(@PathVariable String issueName){
        deleteTemplateService.deleteTemplate(issueName);
    }
}
