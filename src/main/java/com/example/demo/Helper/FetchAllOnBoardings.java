package com.example.demo.Helper;

import com.example.demo.entity.Templates;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class FetchAllOnBoardings {
    public List<Templates> fetchAllOnBoardings(){
//        String path = "../demo/src/main/resources/package.json";
//        ObjectMapper objectMapper=new ObjectMapper();
//        List<Templates> templateCreation=objectMapper.readValue(new File(path), new TypeReference<>() {});
//        return templateCreation;

//        Reading file XML

        String path = "../demo/src/main/resources/OnBoardings.xml";
        List<Templates> onBoardingList=new ArrayList<>();
        try {
            File file = new File(path);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("Template");
            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    String issueName=eElement.getElementsByTagName("issueName").item(0).getTextContent();
                    String category=eElement.getElementsByTagName("category").item(0).getTextContent();
                    String title=eElement.getElementsByTagName("title").item(0).getTextContent();
                    String description=eElement.getElementsByTagName("description").item(0).getTextContent();
                    String assignedFolder=eElement.getElementsByTagName("assignedFolder").item(0).getTextContent();
                    onBoardingList.add(new Templates(issueName,category,title,description,assignedFolder));
                }
            }
        } catch (ParserConfigurationException | SAXException ex) {
            throw new RuntimeException(ex);
        } catch (Exception e){
            e.printStackTrace();
        }
        return onBoardingList;
    }
}
