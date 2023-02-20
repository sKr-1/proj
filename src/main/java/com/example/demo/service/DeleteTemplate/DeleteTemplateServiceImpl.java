package com.example.demo.service.DeleteTemplate;

import com.example.demo.repository.DeleteTemplateDao.DeleteTemplateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteTemplateServiceImpl implements DeleteTemplateService{
    private final DeleteTemplateDao deleteTemplateDao;

    @Autowired
    public DeleteTemplateServiceImpl(DeleteTemplateDao deleteTemplateDao){
        this.deleteTemplateDao=deleteTemplateDao;
    }

    @Override
    public void deleteTemplate(String issueName) {
        deleteTemplateDao.delete(issueName);
    }
}
