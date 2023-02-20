package com.example.demo.repository.CreateIssueDao;

import com.example.demo.Helper.CheckForCountry;
import com.example.demo.entity.IssueCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CreateIssueDaoImpl implements CreateIssueDao{
    private final CheckForCountry checkForCountry;

    @Autowired
    public CreateIssueDaoImpl(CheckForCountry checkForCountry) {
        this.checkForCountry = checkForCountry;
    }

    @Override
    public void addIssueDao(IssueCreation issueCreation) {
        checkForCountry.checkForCountry(issueCreation);
    }
}
