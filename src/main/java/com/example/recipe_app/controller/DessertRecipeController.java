package com.example.recipe_app.controller;

import com.example.recipe_app.model.DessertRecipe;
import com.example.recipe_app.repository.DessertRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dessert-recipes")
public class DessertRecipeController {

    @Autowired
    private DessertRecipeRepository dessertRecipeRepository;

    @GetMapping
    public List<DessertRecipe> getAllDessertRecipes() {
        return dessertRecipeRepository.findAll();
    }
}
