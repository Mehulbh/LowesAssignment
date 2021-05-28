package com.example.Lowes.Assignment.service;

import com.example.Lowes.Assignment.model.CategoryModel;
import com.example.Lowes.Assignment.model.dto.LowesDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LowesService {
    private final RestTemplate restTemplate;


    public LowesService() {
        this.restTemplate = new RestTemplate();
    }

    public CategoryModel getLowesAsPlainJSON(int i) {
        String url = "https://opentdb.com/api.php?amount=5&category={i}";
        return this.restTemplate.getForObject(url, CategoryModel.class, i);
    }
}
