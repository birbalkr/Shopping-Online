package com.example.shopping_Backenddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping_Backenddemo.BookItem;
import com.example.shopping_Backenddemo.service.BookSerivce;

@RestController
public class BookController {


    @Autowired
    BookSerivce bookSerivce;
   
    @GetMapping("api/book")
    public List<BookItem> getALLBook() {
        return bookSerivce.readBooks();
    }

    @GetMapping("api/book/{id}")
    public BookItem readBook(@PathVariable Long id) {
        return bookSerivce.readBook(id);
    }

    @PostMapping("api/book")
    public String createBook(@RequestBody BookItem bookItem) {
        return bookSerivce.createBook(bookItem);

    }
    
    @DeleteMapping("api/book/{id}")
    public String deleteBook(@PathVariable Long id) {
        if (bookSerivce.deleteBook(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/book/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody BookItem bookItem) {
        return bookSerivce.updateBook(id, bookItem);
    }
}
