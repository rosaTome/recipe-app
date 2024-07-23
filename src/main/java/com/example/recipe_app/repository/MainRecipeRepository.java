package com.example.recipe_app.repository;

import com.example.recipe_app.model.MainRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD operations for entity class
public interface MainRecipeRepository extends JpaRepository<MainRecipe, Long> {
}
