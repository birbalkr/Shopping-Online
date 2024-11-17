package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.CarMotorbikeItem;

public interface CarMotorbikeSerivce {
    String createCarMotorbike(CarMotorbikeItem carMotorbikeItem); 

    List<CarMotorbikeItem> readCarMotorbikes();

    boolean deleteCarMotorbike(Long id);

    String updateCarMotorbike(Long id, CarMotorbikeItem carMotorbikeItem);

    CarMotorbikeItem readCarMotorbike(Long id);
}
