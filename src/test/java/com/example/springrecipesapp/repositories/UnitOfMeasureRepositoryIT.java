package com.example.springrecipesapp.repositories;

import com.example.springrecipesapp.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {
    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescriptionCup() {
        Optional<UnitOfMeasure>unitOfMeasureOptional = Optional.ofNullable(unitOfMeasureRepository.findByDescription("Cup"));
        assertEquals("Cup",unitOfMeasureOptional.get().getDescription());

    }

    @Test
    public void findByDescription() {
        Optional<UnitOfMeasure>unitOfMeasureOptional = Optional.ofNullable(unitOfMeasureRepository.findByDescription("Teaspoon"));
        assertEquals("Teaspoon",unitOfMeasureOptional.get().getDescription());
    }
}