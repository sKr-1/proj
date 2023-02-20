package com.example.demo.controller;

import com.example.demo.entity.IssueCreation;
import com.example.demo.service.CreateIssue.CreateIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CreateIssueController {
    private final CreateIssueService createIssueService;
    @Autowired
    public CreateIssueController(CreateIssueService createIssueService){
        this.createIssueService=createIssueService;
    }
    @PostMapping("/createIssue")
    public String createIssue(@RequestBody IssueCreation issueCreation){
        createIssueService.addIssueService(issueCreation);
        System.out.println(issueCreation.toString());
        return "skr";
    }
}
