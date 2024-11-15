package com.example.shopping_Backenddemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.ProductItem;
import com.example.shopping_Backenddemo.entity.ProductEntity;
import com.example.shopping_Backenddemo.repository.ProductRepository;


@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public String createProduct(ProductItem productItem) {
        ProductEntity productEntity = new ProductEntity();
        BeanUtils.copyProperties(productItem, productEntity);
        
        productRepository.save(productEntity);
        return "Saved";
    }

    @Override
    public List<ProductItem> readProducts() {
        List<ProductEntity> productList = productRepository.findAll();
        List<ProductItem> productItems = new ArrayList<>();

        for (ProductEntity productEntity : productList) {

            ProductItem emp = new ProductItem();
            emp.setTitle(productEntity.getTitle());
            emp.setDescription(productEntity.getDescription());
            emp.setId(productEntity.getId());
            emp.setPrice(productEntity.getPrice());

            productItems.add(emp);
        }
        return productItems;
    }

    @Override
    public boolean deleteProduct(Long id) {
        ProductEntity emp = productRepository.findById(id).get();
        productRepository.delete(emp);
        return true;
    }

    @Override
    public String updateProduct(Long id, ProductItem productItem) {
        ProductEntity exestingProductItem = productRepository.findById(id).get();
        exestingProductItem.setTitle(productItem.getTitle());
        exestingProductItem.setDescription(productItem.getDescription());
        exestingProductItem.setPrice(productItem.getPrice());
        productRepository.save(exestingProductItem);
        return "Update Succesfully";
        }

    @Override
    public ProductItem readProduct(Long id) {
        ProductEntity productEntity = productRepository.findById(id).get(); 
        ProductItem productItem = new ProductItem();
        BeanUtils.copyProperties(productEntity, productItem); 

        return productItem;
         }


}
