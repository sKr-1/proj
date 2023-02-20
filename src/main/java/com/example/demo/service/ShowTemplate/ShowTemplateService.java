package com.example.demo.service.ShowTemplate;

import com.example.demo.entity.Templates;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Service
public interface ShowTemplateService {
    public List<Templates> fetchTemplates(String countryName) throws IOException, ParserConfigurationException, SAXException, TransformerException;
}
