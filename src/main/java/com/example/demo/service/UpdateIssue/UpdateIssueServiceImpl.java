package com.example.demo.service.UpdateIssue;

import com.example.demo.repository.UpdateIssueDao.UpdateIssueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateIssueServiceImpl implements UpdateIssueService{

    private final UpdateIssueDao updateIssueDao;

    @Autowired
    public UpdateIssueServiceImpl(UpdateIssueDao updateIssueDao){
        this.updateIssueDao=updateIssueDao;
    }

    @Override
    public void updateIssue(String issueId) {
        //check if issue name is not null.
        updateIssueDao.updateIssue(issueId);
    }
}
