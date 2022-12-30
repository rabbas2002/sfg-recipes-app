package com.example.springrecipesapp.controllers;

import com.example.springrecipesapp.domain.Category;
import com.example.springrecipesapp.domain.UnitOfMeasure;
import com.example.springrecipesapp.repositories.CategoryRepository;
import com.example.springrecipesapp.repositories.RecipeRepository;
import com.example.springrecipesapp.repositories.UnitOfMeasureRepository;
import com.example.springrecipesapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

   private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
