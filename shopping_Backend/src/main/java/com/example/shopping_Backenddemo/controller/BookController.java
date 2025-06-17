package com.example.shopping_Backenddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("http://localhost:5173") // Allowing all routes under localhost:5173
public class BookController {

    @Autowired
    private BookSerivce bookSerivce;

    
    @GetMapping("api/book")
    public ResponseEntity<List<BookItem>> getAllBooks() {
        List<BookItem> books = bookSerivce.readBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // Get a specific book by id
    
    @GetMapping("api/book/{id}")
    public ResponseEntity<BookItem> getBookById(@PathVariable Long id) {
        BookItem book = bookSerivce.readBook(id);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new book
    
    @PostMapping("api/book")
    public ResponseEntity<String> createBook(@RequestBody BookItem bookItem) {
        String response = bookSerivce.createBook(bookItem);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Delete a book by id
    
    @DeleteMapping("api/book/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        boolean deleted = bookSerivce.deleteBook(id);
        if (deleted) {
            return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
        }
    }

    // Update a book by id
    
    @PutMapping("api/book/{id}")
    public ResponseEntity<String> updateBook(@PathVariable Long id, @RequestBody BookItem bookItem) {
        String response = bookSerivce.updateBook(id, bookItem);
        if ("Book not found".equals(response)) {
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
