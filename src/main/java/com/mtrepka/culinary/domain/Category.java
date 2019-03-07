package com.mtrepka.culinary.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category {
    @GeneratedValue
    @Id
    private int id;


    @ManyToMany(mappedBy = "categories")
    private List<Tag> tags  = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "category_recipe",
            joinColumns =  @JoinColumn(name = "fk_category"),
            inverseJoinColumns = @JoinColumn(name = "fk_recipe")
    )
    private List<Recipe> recipies  = new ArrayList<>();
}
