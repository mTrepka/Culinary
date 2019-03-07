package com.mtrepka.culinary.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Recipe {
    @GeneratedValue
    @Id
    private int id;

    @ManyToMany(mappedBy = "recipies")
    private List<Tag> tags  = new ArrayList<>();
    @ManyToMany(mappedBy = "recipies")
    private List<Ingredient> ingredients  = new ArrayList<>();
    @ManyToMany(mappedBy = "recipies")
    private List<Category> categories  = new ArrayList<>();
}
