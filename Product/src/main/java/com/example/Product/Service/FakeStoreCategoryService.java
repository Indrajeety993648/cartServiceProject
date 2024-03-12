package com.example.Product.Service;

import com.example.Product.models.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreCategoryService implements CategoryServices{

    private RestTemplate restTemplate= new RestTemplate();


    @Override
    public String[] getAllCategories() {
        ResponseEntity<String[]> response =
                restTemplate.getForEntity(
                        "https://fakestoreapi.com/products/categories",
                        String[].class);
        String[] allCategories = response.getBody();
        return allCategories;

    }

    @Override
    public Category getInCategory(String name) {
        Category newCategory = new Category(name);
        return newCategory;
    }
}