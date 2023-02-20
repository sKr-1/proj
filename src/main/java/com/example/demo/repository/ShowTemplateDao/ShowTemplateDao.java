package com.example.demo.repository.ShowTemplateDao;

import com.example.demo.entity.Templates;
import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Repository
public interface ShowTemplateDao {
    public List<Templates> returnTemplates(String countryName) throws IOException, ParserConfigurationException, SAXException, TransformerException;
}
