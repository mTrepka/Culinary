package com.mtrepka.culinary.service;


import com.mtrepka.culinary.domain.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Category getById(int id);
}
