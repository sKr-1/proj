package com.example.demo.controller;

import com.example.demo.entity.Templates;
import com.example.demo.repository.ShowTemplateDao.ShowTemplateDao;
import com.example.demo.service.ShowTemplate.ShowTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.*;

@RestController
@CrossOrigin
public class ShowTemplateController {
    private final ShowTemplateService showTemplateService;

    @Autowired
    public ShowTemplateController(ShowTemplateService showTemplateService){
        this.showTemplateService=showTemplateService;
    }
    @GetMapping("/showTemplate/{countryName}")
    public List<Templates> showTemplate(@PathVariable String countryName) throws IOException, ParserConfigurationException, SAXException, TransformerException {
        List<Templates> onBoardings=showTemplateService.fetchTemplates(countryName);
        return onBoardings;
    }
}
