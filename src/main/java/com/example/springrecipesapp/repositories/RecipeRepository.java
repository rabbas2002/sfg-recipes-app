package com.example.springrecipesapp.repositories;

import com.example.springrecipesapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
