package com.mtrepka.culinary.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "recipe")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Recipe {
    @GeneratedValue
    @Id
    private int id;
    private String r_name;
    private String r_description;

    @ElementCollection
    @CollectionTable(name = "steps",joinColumns = @JoinColumn(name="recipe_id"))
    @Column(name = "step")
    private List<String> steps;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "quantity_recipe",
            joinColumns = @JoinColumn(name = "fk_quantity"),
            inverseJoinColumns = @JoinColumn(name = "fk_recipe")
    )
    private List<Quantity> Quantities = new ArrayList<>();
}
