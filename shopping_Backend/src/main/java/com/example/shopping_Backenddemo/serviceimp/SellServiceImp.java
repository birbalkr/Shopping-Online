package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.SellItem;

import com.example.shopping_Backenddemo.entity.ProductSellEntity;

import com.example.shopping_Backenddemo.repository.SellRepository;
import com.example.shopping_Backenddemo.service.SellService;

@Service
public class SellServiceImp implements SellService{

    @Autowired
    private SellRepository sellRepository;

    @Override
    public String createSell(SellItem sellItem) {
        ProductSellEntity productSellEntity = new ProductSellEntity();
        BeanUtils.copyProperties(sellItem, productSellEntity);

        sellRepository.save(productSellEntity);
        return "Saved";
    }

    @Override
    public List<SellItem> readSells() {
        List<ProductSellEntity> bookList = sellRepository.findAll();
        List<SellItem> sellItem = new ArrayList<>();

        for (ProductSellEntity productSellEntity : bookList) {

            SellItem emp = new SellItem();
            emp.setTitle(productSellEntity.getTitle());
            emp.setDescription(productSellEntity.getDescription());
            emp.setId(productSellEntity.getId());
            emp.setPrice(productSellEntity.getPrice());
            emp.setImage(productSellEntity.getImage());
            emp.setReviews(productSellEntity.getReviews());

            sellItem.add(emp);
        }
        return sellItem;
    }

    @Override
    public boolean deleteSell(Long id) {
        ProductSellEntity emp = sellRepository.findById(id).get();
        sellRepository.delete(emp);
        return true;
    }

    @Override
    public String updateSell(Long id, SellItem sellItem) {
        ProductSellEntity exestingBookItem = sellRepository.findById(id).get();
        exestingBookItem.setTitle(sellItem.getTitle());
        exestingBookItem.setDescription(sellItem.getDescription());
        exestingBookItem.setPrice(sellItem.getPrice());
        exestingBookItem.setImage(sellItem.getImage());
        exestingBookItem.setReviews(sellItem.getReviews());
        sellRepository.save(exestingBookItem);
        return "Update Succesfully";
    }

    @Override
    public SellItem readSell(Long id) {
        ProductSellEntity productSellEntity = sellRepository.findById(id).get();
        SellItem sellItem = new SellItem();
        BeanUtils.copyProperties(productSellEntity, sellItem);

        return sellItem;
    }
}
