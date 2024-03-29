package com.example.Product.Controller;

import com.example.Product.models.Category;
import com.example.Product.Service.CategoryServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CategoryController {
    private CategoryServices categoryServices;
    CategoryController(CategoryServices categoryServices){
        this.categoryServices=categoryServices;
    }
    @GetMapping("/products/categories")
    public String[] getAllCategories(){
        return categoryServices.getAllCategories();
    }
    @GetMapping("/products/categories/{categoryName}")
    public Category getInCategory(@PathVariable("categoryName")String categoryName){

        return categoryServices.getInCategory(categoryName);
    }

}