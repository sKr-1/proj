package com.example.demo.service.UpdateTemplate;

import com.example.demo.entity.Templates;
import com.example.demo.repository.UpdateTemplateDao.UpdateTemplateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateTemplateServiceImpl implements UpdateTemplateService {

    private final UpdateTemplateDao updateTemplateDao;

    @Autowired
    public UpdateTemplateServiceImpl(UpdateTemplateDao updateTemplateDao){
        this.updateTemplateDao=updateTemplateDao;
    }
    @Override
    public void updateTemplateService(Templates templateCreation) {
        //check if fields coming are not null, if not forward to updateTemplateDao.
        updateTemplateDao.updateTemplate(templateCreation);
    }
}
