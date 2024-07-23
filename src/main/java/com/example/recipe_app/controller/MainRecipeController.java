package com.example.recipe_app.controller;

import com.example.recipe_app.model.MainRecipe;
import com.example.recipe_app.repository.MainRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

// define the base URL for all endpoints in this controller
@RequestMapping
public class MainRecipeController {

// inject the repository dependency
    @Autowired
    private MainRecipeRepository mainRecipeRepository;

    @GetMapping
    public List<MainRecipe> getAllMainRecipes() {
        return mainRecipeRepository.findAll();
    }
}

