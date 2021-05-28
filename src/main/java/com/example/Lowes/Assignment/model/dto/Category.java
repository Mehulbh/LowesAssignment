package com.example.Lowes.Assignment.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String category;

    private List<FinalDto> results= new ArrayList<>();

    public Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<FinalDto> getResults() {
        return results;
    }

    public void setResults(List<FinalDto> results) {
        this.results = results;
    }

    public void addResults(FinalDto result) {
        this.results.add(result);
    }
}
