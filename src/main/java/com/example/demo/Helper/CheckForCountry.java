package com.example.demo.Helper;

import com.example.demo.entity.IssueCreation;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


@Component
public class CheckForCountry {

    public boolean checkForCountry(IssueCreation issueCreation){
        String path = "../demo/src/main/resources/OnBoardingsCreatedCountryWise.xml";
        Document document=null;
        try {
            File file = new File(path);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            document = db.parse(file);
            Element root = document.getDocumentElement();
            document.getDocumentElement().normalize();

            NodeList nodeList= document.getElementsByTagName("OnBoarding");
            boolean isPresent=false;
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    String country = node.getAttributes().getNamedItem("countryName").getNodeValue();
                    if(country.equals(issueCreation.getCountryName())) {
                        System.out.println(issueCreation.getCountryName());
                        Element name = document.createElement("IssueName");
                        name.appendChild(document.createTextNode(issueCreation.getIssueName()));
                        node.appendChild(name);
                        isPresent=true;
                        break;
                    }
                }
            }
            if(!isPresent){
                Element newNode = document.createElement("OnBoarding");
                newNode.setAttribute("countryName", issueCreation.getCountryName());
                Element child =document.createElement("IssueName");
                child.appendChild(document.createTextNode(issueCreation.getIssueName()));
                newNode.appendChild(child);
                root.appendChild(newNode);
            }
        } catch (ParserConfigurationException | SAXException ex) {
            throw new RuntimeException(ex);
        } catch (Exception e){
            e.printStackTrace();
        }

        DOMSource source = new DOMSource(document);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transformerFactory.newTransformer();
            StreamResult result = new StreamResult(path);
            transformer.transform(source, result);
        }
        catch (TransformerConfigurationException transformerConfigurationException){
            transformerConfigurationException.printStackTrace();
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
}
