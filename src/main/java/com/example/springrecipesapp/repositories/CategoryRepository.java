package com.example.springrecipesapp.repositories;

import com.example.springrecipesapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    <Optional>Category findByDescription(String description);

}
