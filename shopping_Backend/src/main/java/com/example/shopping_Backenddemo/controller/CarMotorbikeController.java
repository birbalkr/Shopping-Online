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

import com.example.shopping_Backenddemo.CarMotorbikeItem;
import com.example.shopping_Backenddemo.service.CarMotorbikeSerivce;

@RestController
public class CarMotorbikeController {
    
    @Autowired
    CarMotorbikeSerivce carMotorbikeSerivce;

    @GetMapping("api/carMotorbike")
    public List<CarMotorbikeItem> getALLCarMotorbike() {
        return carMotorbikeSerivce.readCarMotorbikes();
    }

    @GetMapping("api/carMotorbike/{id}")
    public CarMotorbikeItem readCarMotorbike(@PathVariable Long id) {
        return carMotorbikeSerivce.readCarMotorbike(id);
    }

    @PostMapping("api/carMotorbike")
    public String createCarMotorbike(@RequestBody CarMotorbikeItem carMotorbikeItem) {
        return carMotorbikeSerivce.createCarMotorbike(carMotorbikeItem);

    }

    @DeleteMapping("api/carMotorbike/{id}")
    public String deleteCarMotorbike(@PathVariable Long id) {
        if (carMotorbikeSerivce.deleteCarMotorbike(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/carMotorbike/{id}")
    public String updateCarMotorbike(@PathVariable Long id, @RequestBody CarMotorbikeItem carMotorbikeItem) {
        return carMotorbikeSerivce.updateCarMotorbike(id, carMotorbikeItem);
    }

}
