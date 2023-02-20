package com.example.demo.repository.CreateIssueDao;

import com.example.demo.entity.IssueCreation;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateIssueDao {
    public void addIssueDao(IssueCreation issueCreation);
}
