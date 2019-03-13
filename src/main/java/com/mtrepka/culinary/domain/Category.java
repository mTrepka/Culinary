package com.mtrepka.culinary.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "category")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category {
    @GeneratedValue
    @Id
    private int id;
    private String cName;
    private String cDescription;
    private String imgUrl;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "category_recipe",
            joinColumns =  @JoinColumn(name = "fk_category"),
            inverseJoinColumns = @JoinColumn(name = "fk_recipe")
    )
    private List<Recipe> recipes  = new ArrayList<>();
}
