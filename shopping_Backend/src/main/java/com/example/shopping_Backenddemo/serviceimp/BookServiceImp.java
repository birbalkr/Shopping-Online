package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.BookItem;
import com.example.shopping_Backenddemo.entity.ProductBooksEntity;
import com.example.shopping_Backenddemo.repository.BookRepository;
import com.example.shopping_Backenddemo.service.BookSerivce;

@Service
public class BookServiceImp implements BookSerivce {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public String createBook(BookItem bookItem) {
        ProductBooksEntity productBooksEntity = new ProductBooksEntity();
        BeanUtils.copyProperties(bookItem, productBooksEntity);

        bookRepository.save(productBooksEntity);
        return "Saved";
    }

    @Override
    public List<BookItem> readBooks() {
        List<ProductBooksEntity> bookList = bookRepository.findAll();
        List<BookItem> bookItem = new ArrayList<>();

        for (ProductBooksEntity productBooksEntity : bookList) {

            BookItem emp = new BookItem();
            emp.setTitle(productBooksEntity.getTitle());
            emp.setDescription(productBooksEntity.getDescription());
            emp.setId(productBooksEntity.getId());
            emp.setPrice(productBooksEntity.getPrice());
            emp.setImage(productBooksEntity.getImage());
            emp.setReviews(productBooksEntity.getReviews());

            bookItem.add(emp);
        }
        return bookItem;
    }

    @Override
    public boolean deleteBook(Long id) {
        ProductBooksEntity emp = bookRepository.findById(id).get();
        bookRepository.delete(emp);
        return true;
    }

    @Override
    public String updateBook(Long id, BookItem bookItem) {
        ProductBooksEntity exestingBookItem = bookRepository.findById(id).get();
        exestingBookItem.setTitle(bookItem.getTitle());
        exestingBookItem.setDescription(bookItem.getDescription());
        exestingBookItem.setPrice(bookItem.getPrice());
        exestingBookItem.setImage(bookItem.getImage());
        exestingBookItem.setReviews(bookItem.getReviews());
        bookRepository.save(exestingBookItem);
        return "Update Succesfully";
    }

    @Override
    public BookItem readBook(Long id) {
        ProductBooksEntity productBooksEntity = bookRepository.findById(id).get();
        BookItem bookItem = new BookItem();
        BeanUtils.copyProperties(productBooksEntity, bookItem);

        return bookItem;
    }
}
