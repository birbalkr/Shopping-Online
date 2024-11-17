package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.MobileItem;

public interface MobileSerivce {

    String createBook(MobileItem mobileItem); 

    List<MobileItem> readBooks();

    boolean deleteBook(Long id);

    String updateBook(Long id, MobileItem mobileItem);

    MobileItem readBook(Long id);
}