package com.example.demo.repository.UpdateIssueDao;

import org.springframework.stereotype.Repository;

@Repository
public interface UpdateIssueDao {
    public void updateIssue(String issueName);
}
