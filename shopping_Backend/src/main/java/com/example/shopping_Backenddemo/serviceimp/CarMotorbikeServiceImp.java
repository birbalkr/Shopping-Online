package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.CarMotorbikeItem;
import com.example.shopping_Backenddemo.entity.ProductCarMotorbikeEntity;
import com.example.shopping_Backenddemo.repository.CarMoterbikelRepository;
import com.example.shopping_Backenddemo.service.CarMotorbikeSerivce;


@Service
public class CarMotorbikeServiceImp implements CarMotorbikeSerivce{

    @Autowired
    private CarMoterbikelRepository carMoterbikelRepository;

    @Override
    public String createCarMotorbike(CarMotorbikeItem carMotorbikeItem) {
        ProductCarMotorbikeEntity productCarMotorbikeEntity = new ProductCarMotorbikeEntity();
        BeanUtils.copyProperties(carMotorbikeItem, productCarMotorbikeEntity);

        carMoterbikelRepository.save(productCarMotorbikeEntity);
        return "Saved";
    }

    @Override
    public List<CarMotorbikeItem> readCarMotorbikes() {
        List<ProductCarMotorbikeEntity> bookList = carMoterbikelRepository.findAll();
        List<CarMotorbikeItem> carMotorbikeItem = new ArrayList<>();

        for (ProductCarMotorbikeEntity productCarMotorbikeEntity : bookList) {

            CarMotorbikeItem emp = new CarMotorbikeItem();
            emp.setTitle(productCarMotorbikeEntity.getTitle());
            emp.setDescription(productCarMotorbikeEntity.getDescription());
            emp.setId(productCarMotorbikeEntity.getId());
            emp.setPrice(productCarMotorbikeEntity.getPrice());
            emp.setImage(productCarMotorbikeEntity.getImage());
            emp.setReviews(productCarMotorbikeEntity.getReviews());

            carMotorbikeItem.add(emp);
        }
        return carMotorbikeItem;
    }

    @Override
    public boolean deleteCarMotorbike(Long id) {
        ProductCarMotorbikeEntity emp = carMoterbikelRepository.findById(id).get();
        carMoterbikelRepository.delete(emp);
        return true;
    }

    @Override
    public String updateCarMotorbike(Long id, CarMotorbikeItem carMotorbikeItem) {
        ProductCarMotorbikeEntity exestingBookItem = carMoterbikelRepository.findById(id).get();
        exestingBookItem.setTitle(carMotorbikeItem.getTitle());
        exestingBookItem.setDescription(carMotorbikeItem.getDescription());
        exestingBookItem.setPrice(carMotorbikeItem.getPrice());
        exestingBookItem.setImage(carMotorbikeItem.getImage());
        exestingBookItem.setReviews(carMotorbikeItem.getReviews());
        carMoterbikelRepository.save(exestingBookItem);
        return "Update Succesfully";
    }

    @Override
    public CarMotorbikeItem readCarMotorbike(Long id) {
        ProductCarMotorbikeEntity productCarMotorbikeEntity = carMoterbikelRepository.findById(id).get();
        CarMotorbikeItem carMotorbikeItem = new CarMotorbikeItem();
        BeanUtils.copyProperties(productCarMotorbikeEntity, carMotorbikeItem);

        return carMotorbikeItem;
    }
}
