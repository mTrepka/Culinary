package com.mtrepka.culinary.service;

import com.mtrepka.culinary.domain.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> getAll();

    Ingredient getById(int id);
}
