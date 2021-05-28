package com.example.Lowes.Assignment.controller;

import com.example.Lowes.Assignment.model.dto.Category;
import com.example.Lowes.Assignment.model.dto.LowesDto;
import com.example.Lowes.Assignment.model.CategoryModel;
import com.example.Lowes.Assignment.model.mapper.LowesMapper;
import com.example.Lowes.Assignment.service.LowesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@RestController
public class LowesController {

    @Autowired
    LowesService lowesService;

    @GetMapping("/coding/exercise/quiz")
    public LowesDto getLowes() {
        int arr[] = {11, 12};
        List<CompletableFuture<CategoryModel>> resList = new ArrayList<>();

        for (int i : arr) {
            resList.add(CompletableFuture.supplyAsync(() -> lowesService.getLowesAsPlainJSON(i)));
        }

        System.out.println(resList);

        List<Category> categoryList = resList.stream().map(CompletableFuture::join)
                .map(LowesMapper::map)
                .collect(Collectors.toList());


        return new LowesDto(categoryList);
    }
}