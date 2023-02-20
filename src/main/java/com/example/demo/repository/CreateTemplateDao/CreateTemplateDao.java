package com.example.demo.repository.CreateTemplateDao;

import com.example.demo.entity.Templates;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public interface CreateTemplateDao {
    public void addTemplate(Templates templates) throws IOException;
}
