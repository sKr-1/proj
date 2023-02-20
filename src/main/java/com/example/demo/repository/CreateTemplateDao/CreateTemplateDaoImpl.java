package com.example.demo.repository.CreateTemplateDao;

import com.example.demo.entity.Templates;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@Component
public class CreateTemplateDaoImpl implements CreateTemplateDao {
    @Override
    public void addTemplate(Templates templates) throws IOException {

        String path = "../demo/src/main/resources/package.json";
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.writeValue(new File(path),templates);

    }
}
