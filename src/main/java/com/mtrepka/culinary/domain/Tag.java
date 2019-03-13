package com.mtrepka.culinary.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Tag {
    @GeneratedValue
    @Id
    private int id;
    private String t_name;

    @ManyToMany
    @JoinTable(name = "tag_recipe",
            joinColumns =  @JoinColumn(name = "fk_tag"),
            inverseJoinColumns = @JoinColumn(name = "fk_recipe")
    )
    private List<Recipe> recipes  = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "tag_category",
            joinColumns =  @JoinColumn(name = "fk_tag"),
            inverseJoinColumns = @JoinColumn(name = "fk_category")
    )
    private List<Category> categories  = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "tag_ingredient",
            joinColumns =  @JoinColumn(name = "fk_tag"),
            inverseJoinColumns = @JoinColumn(name = "fk_ingredient")
    )
    private List<Category> ingredients  = new ArrayList<>();
}
