package com.mtrepka.culinary.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Ingredient {
    @GeneratedValue
    @Id
    private int id;

    @ManyToMany
    @JoinTable(name = "ingredient_recipe",
            joinColumns =  @JoinColumn(name = "fk_ingredient"),
            inverseJoinColumns = @JoinColumn(name = "fk_recipe")
    )
    private List<Recipe> recipies  = new ArrayList<>();

    @ManyToMany(mappedBy = "ingredients")
    private List<Tag> tags  = new ArrayList<>();
}
