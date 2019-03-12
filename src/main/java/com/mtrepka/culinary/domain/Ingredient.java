package com.mtrepka.culinary.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "ingredient")
@Data
@NoArgsConstructor
public class Ingredient {
    @GeneratedValue
    @Id
    private int id;
    private String iName;
}
