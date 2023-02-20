package com.example.demo.Helper;

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
public class FetchOnBoardingsCreatedForCountry {
    public List<String> fetchOnBoarding(String countryName){
        String path = "../demo/src/main/resources/OnBoardingsCreatedCountryWise.xml";
        List<String> onboarding=null;
        try {
            File file = new File(path);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            Element root = doc.getDocumentElement();
            doc.getDocumentElement().normalize();

            NodeList nodeList= doc.getElementsByTagName("OnBoarding");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(node.getNodeName()+" "+node.getNodeValue()+" "+node.getChildNodes());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    String country = node.getAttributes().getNamedItem("countryName").getNodeValue();
                    if(country.equals(countryName)) {
                        NodeList nodes = doc.getElementsByTagName("IssueName");
                        onboarding = new ArrayList<>();
                        for (int j = 0; j < nodes.getLength(); j++) {
                            Node node1 = nodes.item(j);
                            Element eElement = (Element) node1;
                            System.out.println();
                            String issueName = eElement.getTextContent();
                            onboarding.add(issueName);
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException ex) {
            throw new RuntimeException(ex);
        } catch (Exception e){
            e.printStackTrace();
        }
        return onboarding;
    }
}
