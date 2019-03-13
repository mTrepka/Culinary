package com.mtrepka.culinary.configuration;


import com.mtrepka.culinary.domain.Category;
import com.mtrepka.culinary.domain.Recipe;
import com.mtrepka.culinary.service.CategoryService;
import com.mtrepka.culinary.service.IngredientService;
import com.mtrepka.culinary.service.RecipeService;
import com.mtrepka.culinary.service.TagService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class AppRest {
    private final RecipeService recipeService;
    private final TagService tagService;
    private final IngredientService ingredientService;
    private final CategoryService categoryService;


    @GetMapping("/category/")
    List<Category> getAllCategory() {
        return categoryService.getAll();
    }

    @GetMapping("/category/{id}")
    Category getCategoryById(@PathVariable("id") int id) {
        return categoryService.getById(id);
    }

    @GetMapping("/recipe/")
    List<Recipe> getAllRecipes() {
        return recipeService.getAll();
    }

    @GetMapping("/recipe/{id}")
    Recipe getRecipeById(@PathVariable("id") int id) {
        return recipeService.getById(id);
    }

}
