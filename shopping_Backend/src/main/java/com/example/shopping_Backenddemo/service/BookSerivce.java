package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.BookItem;

public interface BookSerivce {

    String createBook(BookItem bookItem); 

    List<BookItem> readBooks();

    boolean deleteBook(Long id);

    String updateBook(Long id, BookItem bookItem);

    BookItem readBook(Long id);
}
