package com.example.Lowes.Assignment.model.dto;

import java.util.ArrayList;
import java.util.List;


public class LowesDto {

    private List<Category> quiz = new ArrayList<>();

    public LowesDto(List<Category> quiz) {
        this.quiz = quiz;
    }

    public List<Category> getQuiz() {
        return quiz;
    }

    public void setQuiz(List<Category> quiz) {
        this.quiz = quiz;
    }
}
