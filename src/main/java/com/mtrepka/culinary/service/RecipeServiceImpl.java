package com.mtrepka.culinary.service;

import com.mtrepka.culinary.domain.Recipe;
import com.mtrepka.culinary.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("recipeService")
@AllArgsConstructor
public class RecipeServiceImpl implements RecipeService{
    private final RecipeRepository recipeRepository;

    @Override
    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe getById(int id) {
        return recipeRepository.getOne(id);
    }
}
