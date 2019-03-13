package com.mtrepka.culinary.service;

import com.mtrepka.culinary.domain.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> getAll();

    Recipe getById(int id);
}
