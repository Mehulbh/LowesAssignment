package com.example.Lowes.Assignment.model.dto;

import java.util.ArrayList;
import java.util.List;

public class FinalDto {
    private String type;
    private String difficulty;
    private String question;
    private List<String> all_answers=new ArrayList<>();
    private String correct_answer;


    public FinalDto(String type, String difficulty, String question, List<String> all_answers, String correct_answer) {
        this.type = type;
        this.difficulty = difficulty;
        this.question = question;
        this.all_answers = all_answers;
        this.correct_answer = correct_answer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAll_answers() {
        return all_answers;
    }

    public void setAll_answers(List<String> all_answers) {
        this.all_answers = all_answers;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }
}
