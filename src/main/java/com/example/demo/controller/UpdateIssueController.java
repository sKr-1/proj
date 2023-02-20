package com.example.demo.controller;

import com.example.demo.service.UpdateIssue.UpdateIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateIssueController {

    private final UpdateIssueService updateIssueService;

    @Autowired
    public UpdateIssueController(UpdateIssueService updateIssueService){
        this.updateIssueService=updateIssueService;
    }

    @PutMapping("/updateIssue/{issueId}")
    public String updateIssue(@PathVariable String issueId){
        updateIssueService.updateIssue(issueId);
        return issueId;
    }
}
