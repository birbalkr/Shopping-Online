package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.ProductItem;


public interface ProductService {
    String createProduct(ProductItem productItem); 

    List<ProductItem> readProducts();

    boolean deleteProduct(Long id);

    String updateProduct(Long id, ProductItem productItem);

    ProductItem readProduct(Long id);

}
