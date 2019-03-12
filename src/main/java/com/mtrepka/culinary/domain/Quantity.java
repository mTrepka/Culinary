package com.mtrepka.culinary.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity(name = "quantity")
@Data
@NoArgsConstructor
public class Quantity {
    @GeneratedValue
    @Id
    private int id;
    private double qValue;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

}
