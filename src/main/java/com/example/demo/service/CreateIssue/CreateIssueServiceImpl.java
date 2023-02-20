package com.example.demo.service.CreateIssue;

import com.example.demo.entity.IssueCreation;
import com.example.demo.repository.CreateIssueDao.CreateIssueDao;
import com.example.demo.repository.CreateTemplateDao.CreateTemplateDao;
import com.example.demo.service.CreateIssue.CreateIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateIssueServiceImpl implements CreateIssueService {

    private final CreateIssueDao createIssueDao;

    @Autowired
    public CreateIssueServiceImpl(CreateIssueDao createIssueDao){
        this.createIssueDao=createIssueDao;
    }

    public void addIssueService(IssueCreation issueCreation) {
        //api call to sim to create issue, save the returned id to some file.
        createIssueDao.addIssueDao(issueCreation);
    }
}
