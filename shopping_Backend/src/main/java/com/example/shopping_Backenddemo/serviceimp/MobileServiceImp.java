package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.shopping_Backenddemo.MobileItem;
import com.example.shopping_Backenddemo.entity.ProductBooksEntity;
import com.example.shopping_Backenddemo.repository.BookRepository;
import com.example.shopping_Backenddemo.service.MobileSerivce;

public class MobileServiceImp implements MobileSerivce{
    
    @Autowired
    private BookRepository bookRepository;

    @Override
    public String createBook(MobileItem mobileItem) {
        ProductBooksEntity productBooksEntity = new ProductBooksEntity();
        BeanUtils.copyProperties(mobileItem, productBooksEntity);

        bookRepository.save(productBooksEntity);
        return "Saved";
    }

    @Override
    public List<MobileItem> readBooks() {
        List<ProductBooksEntity> bookList = bookRepository.findAll();
        List<MobileItem> mobileItem = new ArrayList<>();

        for (ProductBooksEntity productBooksEntity : bookList) {

            MobileItem emp = new MobileItem();
            emp.setTitle(productBooksEntity.getTitle());
            emp.setDescription(productBooksEntity.getDescription());
            emp.setId(productBooksEntity.getId());
            emp.setPrice(productBooksEntity.getPrice());
            emp.setImage(productBooksEntity.getImage());
            emp.setReviews(productBooksEntity.getReviews());

            mobileItem.add(emp);
        }
        return mobileItem;
    }

    @Override
    public boolean deleteBook(Long id) {
        ProductBooksEntity emp = bookRepository.findById(id).get();
        bookRepository.delete(emp);
        return true;
    }

    @Override
    public String updateBook(Long id, MobileItem mobileItem) {
        ProductBooksEntity exestingBookItem = bookRepository.findById(id).get();
        exestingBookItem.setTitle(mobileItem.getTitle());
        exestingBookItem.setDescription(mobileItem.getDescription());
        exestingBookItem.setPrice(mobileItem.getPrice());
        exestingBookItem.setImage(mobileItem.getImage());
        exestingBookItem.setReviews(mobileItem.getReviews());
        bookRepository.save(exestingBookItem);
        return "Update Succesfully";
    }

    @Override
    public MobileItem readBook(Long id) {
        ProductBooksEntity productBooksEntity = bookRepository.findById(id).get();
        MobileItem mobileItem = new MobileItem();
        BeanUtils.copyProperties(productBooksEntity, mobileItem);

        return mobileItem;
    }
}
