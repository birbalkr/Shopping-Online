package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.HomeKitchenItem;
import com.example.shopping_Backenddemo.entity.ProductHomeKitchenEntity;
import com.example.shopping_Backenddemo.repository.HomekitchenRepository;
import com.example.shopping_Backenddemo.service.HomeKitchenSerivce;

@Service
public class HomeKitchenServiceImp implements HomeKitchenSerivce {

    @Autowired
    HomekitchenRepository homekitchenRepository;

    @Override
    public String createHome(HomeKitchenItem homeKitchenItem) {
        ProductHomeKitchenEntity productHomeKitchenEntity = new ProductHomeKitchenEntity();
        BeanUtils.copyProperties(homeKitchenItem, productHomeKitchenEntity);

        homekitchenRepository.save(productHomeKitchenEntity);
        return "Saved";
    }

    @Override
    public List<HomeKitchenItem> readHomes() {
         List<ProductHomeKitchenEntity> bookList = homekitchenRepository.findAll();
        List<HomeKitchenItem> homeKitchenItem = new ArrayList<>();

        for (ProductHomeKitchenEntity productHomeKitchenEntity : bookList) {

            HomeKitchenItem emp = new HomeKitchenItem();
            emp.setTitle(productHomeKitchenEntity.getTitle());
            emp.setDescription(productHomeKitchenEntity.getDescription());
            emp.setId(productHomeKitchenEntity.getId());
            emp.setPrice(productHomeKitchenEntity.getPrice());
            emp.setImage1(productHomeKitchenEntity.getImage1());
            emp.setImage2(productHomeKitchenEntity.getImage2());
            emp.setImage3(productHomeKitchenEntity.getImage3());
            emp.setBrand(productHomeKitchenEntity.getBrand());
            emp.setNetQuantity(productHomeKitchenEntity.getNetQuantity());
            emp.setReviews(productHomeKitchenEntity.getReviews());

            homeKitchenItem.add(emp);
        }
        return homeKitchenItem;
    }

    @Override
    public boolean deleteHome(Long id) {
        ProductHomeKitchenEntity emp = homekitchenRepository.findById(id).get();
        homekitchenRepository.delete(emp);
        return true;
    }

    @Override
    public String updateHome(Long id, HomeKitchenItem homeKitchenItem) {
        ProductHomeKitchenEntity exestinghomekitchen = homekitchenRepository.findById(id).get();
        exestinghomekitchen.setTitle(homeKitchenItem.getTitle());
        exestinghomekitchen.setDescription(homeKitchenItem.getDescription());
        exestinghomekitchen.setPrice(homeKitchenItem.getPrice());
        exestinghomekitchen.setImage1(homeKitchenItem.getImage1());
        exestinghomekitchen.setImage2(homeKitchenItem.getImage2());
        exestinghomekitchen.setImage3(homeKitchenItem.getImage3());
        exestinghomekitchen.setBrand(homeKitchenItem.getBrand());
        exestinghomekitchen.setNetQuantity(homeKitchenItem.getNetQuantity());
        exestinghomekitchen.setReviews(homeKitchenItem.getReviews());
        homekitchenRepository.save(exestinghomekitchen);
        return "Update Succesfully";
    }

    @Override
    public HomeKitchenItem readHome(Long id) {
        ProductHomeKitchenEntity productHomeKitchenEntity = homekitchenRepository.findById(id).get();
        HomeKitchenItem homeKitchenItem = new HomeKitchenItem();
        BeanUtils.copyProperties(productHomeKitchenEntity, homeKitchenItem);

        return homeKitchenItem;
    }
    
}
