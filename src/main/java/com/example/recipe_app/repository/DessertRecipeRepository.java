package com.example.recipe_app.repository;

import com.example.recipe_app.model.DessertRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DessertRecipeRepository extends JpaRepository<DessertRecipe, Long> {
}
