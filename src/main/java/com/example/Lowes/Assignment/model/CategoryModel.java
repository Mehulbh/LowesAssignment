package com.example.Lowes.Assignment.model;

import java.util.List;

public class CategoryModel {
    private List<FinalModel> results;

    public CategoryModel() {

    }
    public CategoryModel(List<FinalModel> results) {
        this.results = results;
    }

    public List<FinalModel> getResults() {
        return results;
    }

    public void setResults(List<FinalModel> results) {
        this.results = results;
    }
}
