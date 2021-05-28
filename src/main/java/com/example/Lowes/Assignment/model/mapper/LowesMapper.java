package com.example.Lowes.Assignment.model.mapper;

import com.example.Lowes.Assignment.model.CategoryModel;
import com.example.Lowes.Assignment.model.FinalModel;
import com.example.Lowes.Assignment.model.dto.Category;
import com.example.Lowes.Assignment.model.dto.FinalDto;

import java.util.List;

public class LowesMapper {
    public static Category map(CategoryModel categoryModel) {
        List<FinalModel> result = categoryModel.getResults();
        Category categorydto = new Category(result.get(0).getCategory());
        result.stream().map(LowesMapper::convertFinalModel).forEach(categorydto::addResults);
        return categorydto;
    }

    private static FinalDto convertFinalModel(FinalModel result) {
        List<String> allAnswer = result.getIncorrect_answers();
        allAnswer.add(result.getCorrect_answer());

        return new FinalDto(result.getType(),result.getDifficulty(),result.getQuestion(),allAnswer,result.getCorrect_answer());
    }
}
