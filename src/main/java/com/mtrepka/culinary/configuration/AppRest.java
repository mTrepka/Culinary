package com.mtrepka.culinary.configuration;


import com.mtrepka.culinary.service.CategoryService;
import com.mtrepka.culinary.service.IngredientService;
import com.mtrepka.culinary.service.RecipeService;
import com.mtrepka.culinary.service.TagService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AppRest {
    private final RecipeService recipeService;
    private final TagService tagService;
    private final IngredientService ingredientService;
    private final CategoryService categoryService;
}
