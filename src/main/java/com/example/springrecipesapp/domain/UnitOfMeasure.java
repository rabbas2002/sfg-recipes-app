package com.example.springrecipesapp.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne
    private Ingredient ingredient;


}
