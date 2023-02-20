package com.example.demo.service.ShowTemplate;

import com.example.demo.entity.Templates;
import com.example.demo.repository.ShowTemplateDao.ShowTemplateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Component
public class ShowTemplateServiceImpl implements ShowTemplateService{

    private final ShowTemplateDao showTemplateDao;

    @Autowired
    public ShowTemplateServiceImpl(ShowTemplateDao showTemplateDao) {
        this.showTemplateDao=showTemplateDao;
    }
    @Override
    public List<Templates> fetchTemplates(String countryName) throws IOException, ParserConfigurationException, SAXException, TransformerException {
        List<Templates> templates=showTemplateDao.returnTemplates(countryName);
        //check for null values of templates.
        return templates;
    }
}
