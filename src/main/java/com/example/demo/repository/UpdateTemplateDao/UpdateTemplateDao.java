package com.example.demo.repository.UpdateTemplateDao;

import com.example.demo.entity.Templates;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateTemplateDao {
    public void updateTemplate(Templates templateCreation);
}
