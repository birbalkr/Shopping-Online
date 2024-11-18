package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.FashionItem;

public interface FashionSerivce {
    String createFashion(FashionItem fashionItem); 

    List<FashionItem> readFashions();

    boolean deleteFashion(Long id);

    String updateFashion(Long id, FashionItem fashionItem);

    FashionItem readFashion(Long id);
}
