package com.example.demo;

import com.example.demo.Helper.CheckForCountry;
import com.example.demo.controller.CreateIssueController;
import com.example.demo.controller.CreateTemplateController;
import com.example.demo.controller.ShowTemplateController;
import com.example.demo.entity.CountryCodeProvider;
import com.example.demo.entity.IssueCreation;
import com.example.demo.entity.Templates;
import com.example.demo.service.CountryCode.CountryCodeService;
import com.example.demo.service.CountryCode.CountryCodeServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, TransformerException {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
//		CreateTemplateController createTemplateController=context.getBean(CreateTemplateController.class);
//		Templates templateCreation=new Templates("i","commerce","tittlll","descriptions","assignedFolders");
//		createTemplateController.createTemplate(templateCreation);

//		ShowTemplateController showTemplateController=context.getBean(ShowTemplateController.class);
//		showTemplateController.showTemplate("India");
//		CreateIssueController createIssueController=context.getBean(CreateIssueController.class);
//		IssueCreation issueCreation=new IssueCreation("tittlll","descriptions","assignedFolders");
//		createIssueController.createIssue(issueCreation);

//		CheckForCountry cFC=context.getBean(CheckForCountry.class);
//		cFC.checkForCountry(new IssueCreation("India","issueName5","category5","t","d","a"));

	}
}
