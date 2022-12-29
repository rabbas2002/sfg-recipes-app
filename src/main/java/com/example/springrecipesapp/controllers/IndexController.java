package com.example.springrecipesapp.controllers;

import com.example.springrecipesapp.domain.Category;
import com.example.springrecipesapp.domain.UnitOfMeasure;
import com.example.springrecipesapp.repositories.CategoryRepository;
import com.example.springrecipesapp.repositories.RecipeRepository;
import com.example.springrecipesapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;

    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        Optional<Category>categoryOptional = Optional.ofNullable(categoryRepository.findByDescription("American"));
        Optional<UnitOfMeasure>unitOfMeasureOptional = Optional.ofNullable(unitOfMeasureRepository.findByDescription(("Teaspoon")));
        System.out.println(categoryOptional.get().getId());
        System.out.println(unitOfMeasureOptional.get().getId());
        return "index";
    }
}
