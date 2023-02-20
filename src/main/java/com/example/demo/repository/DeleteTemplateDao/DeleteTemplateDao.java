package com.example.demo.repository.DeleteTemplateDao;

import org.springframework.stereotype.Repository;

@Repository
public interface DeleteTemplateDao {
    public void delete(String issueName);
}
