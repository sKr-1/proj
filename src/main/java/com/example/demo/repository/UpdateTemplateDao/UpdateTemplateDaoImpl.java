package com.example.demo.repository.UpdateTemplateDao;

import com.example.demo.entity.Templates;
import org.springframework.stereotype.Component;

@Component
public class UpdateTemplateDaoImpl implements UpdateTemplateDao{

    @Override
    public void updateTemplate(Templates templateCreation) {
        //find the template by issue name and update.
    }
}
