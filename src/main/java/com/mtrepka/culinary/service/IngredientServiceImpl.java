package com.mtrepka.culinary.service;

import com.mtrepka.culinary.domain.Ingredient;
import com.mtrepka.culinary.repository.IngredientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ingredientService")
@AllArgsConstructor
public class IngredientServiceImpl implements IngredientService{
    private final IngredientRepository ingredientRepository;

    @Override
    public Ingredient getById(int id) {
        return ingredientRepository.getOne(id);
    }

    @Override
    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }
}
