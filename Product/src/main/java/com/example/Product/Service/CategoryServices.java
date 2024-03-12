package com.example.Product.Service;

import com.example.Product.models.Category;

import java.util.List;

public interface CategoryServices {

    String[] getAllCategories();
    Category getInCategory(String name);
}
