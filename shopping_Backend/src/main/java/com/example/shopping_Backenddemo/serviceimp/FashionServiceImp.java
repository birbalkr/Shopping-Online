package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.FashionItem;
import com.example.shopping_Backenddemo.entity.ProductFashionEntity;
import com.example.shopping_Backenddemo.repository.FashionlRepository;
import com.example.shopping_Backenddemo.service.FashionSerivce;


@Service
public class FashionServiceImp implements FashionSerivce{

    @Autowired
    private FashionlRepository fashionlRepository;

    @Override
    public String createFashion(FashionItem fashionItem) {
        ProductFashionEntity productFashionEntity = new ProductFashionEntity();
        BeanUtils.copyProperties(fashionItem, productFashionEntity);

        fashionlRepository.save(productFashionEntity);
        return "Saved";
    }

    @Override
    public List<FashionItem> readFashions() {
        List<ProductFashionEntity> bookList = fashionlRepository.findAll();
        List<FashionItem> fashionItem = new ArrayList<>();

        for (ProductFashionEntity productFashionEntity : bookList) {

            FashionItem emp = new FashionItem();
            emp.setTitle(productFashionEntity.getTitle());
            emp.setDescription(productFashionEntity.getDescription());
            emp.setId(productFashionEntity.getId());
            emp.setPrice(productFashionEntity.getPrice());
            emp.setImage(productFashionEntity.getImage());
            emp.setReviews(productFashionEntity.getReviews());

            fashionItem.add(emp);
        }
        return fashionItem;
    }

    @Override
    public boolean deleteFashion(Long id) {
        ProductFashionEntity emp = fashionlRepository.findById(id).get();
        fashionlRepository.delete(emp);
        return true;
    }

    @Override
    public String updateFashion(Long id, FashionItem fashionItem) {
        ProductFashionEntity exestingfashion = fashionlRepository.findById(id).get();
        exestingfashion.setTitle(fashionItem.getTitle());
        exestingfashion.setDescription(fashionItem.getDescription());
        exestingfashion.setPrice(fashionItem.getPrice());
        exestingfashion.setImage(fashionItem.getImage());
        exestingfashion.setReviews(fashionItem.getReviews());
        fashionlRepository.save(exestingfashion);
        return "Update Succesfully";
    }

    @Override
    public FashionItem readFashion(Long id) {
        ProductFashionEntity productFashionEntity = fashionlRepository.findById(id).get();
        FashionItem fashionItem = new FashionItem();
        BeanUtils.copyProperties(productFashionEntity, fashionItem);

        return fashionItem;
    }
}
