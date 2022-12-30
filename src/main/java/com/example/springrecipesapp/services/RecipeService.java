package com.example.springrecipesapp.services;

import com.example.springrecipesapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService
{
    Set<Recipe> getRecipes();
}
