package com.example.Product.Service;

import com.example.Product.models.Product;

import java.util.List;

public interface ProductServices {
    Product[] getAllProducts();
    Product getSingleProduct(Long id);
    Product addProduct(Product product);
    Product updateProduct(Long id);
    Product deleteProduct(Long id);
    Product[] getLimitedProducts(int limit);
}