package com.example.demo.service.CreateIssue;

import com.example.demo.entity.IssueCreation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface CreateIssueService {
    void addIssueService(IssueCreation issueCreation);
}
