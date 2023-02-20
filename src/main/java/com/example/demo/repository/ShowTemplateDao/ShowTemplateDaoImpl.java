package com.example.demo.repository.ShowTemplateDao;

import com.example.demo.Helper.FetchAllOnBoardings;
import com.example.demo.Helper.FetchOnBoardingsCreatedForCountry;
import com.example.demo.entity.Templates;
import org.springframework.stereotype.Component;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class ShowTemplateDaoImpl implements ShowTemplateDao{
    @Override
    public List<Templates> returnTemplates(String countryName) throws IOException, ParserConfigurationException, SAXException, TransformerException {

        //add value in existing xml file .

//        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
//        Document document = documentBuilder.parse(path1);
//        Element root = document.getDocumentElement();
//
//        Element newServer = document.createElement("Template");
//
//        Element name = document.createElement("issueName");
//        name.appendChild(document.createTextNode("issueName6"));
//        newServer.appendChild(name);
//
//        Element category = document.createElement("category");
//        category.appendChild(document.createTextNode("category6"));
//        newServer.appendChild(category);
//
//        Element title = document.createElement("title");
//        title.appendChild(document.createTextNode("title6"));
//        newServer.appendChild(title);
//
//        Element description = document.createElement("description");
//        description.appendChild(document.createTextNode("description6"));
//        newServer.appendChild(description);
//
//        Element assignedFolder = document.createElement("assignedFolder");
//        assignedFolder.appendChild(document.createTextNode("assignedFolder6"));
//        newServer.appendChild(assignedFolder);
//
//        root.appendChild(newServer);
//
//
//        DOMSource source = new DOMSource(document);
//
//        TransformerFactory transformerFactory = TransformerFactory.newInstance();
//        Transformer transformer = transformerFactory.newTransformer();
//        StreamResult result = new StreamResult(path1);
//        transformer.transform(source, result);


        List<String> onBoardingsForCountry=new FetchOnBoardingsCreatedForCountry().fetchOnBoarding(countryName);
        List<Templates> allOnBoardings=new FetchAllOnBoardings().fetchAllOnBoardings();
        List<Templates> onBoardings=new ArrayList<>();
        if(onBoardingsForCountry.size()>0) {
            for (Templates templates : allOnBoardings) {
                if (!onBoardingsForCountry.contains(templates.getIssueName())) {
                    onBoardings.add(templates);
                }
            }
            return onBoardings;
        }
        return allOnBoardings;
    }

}
