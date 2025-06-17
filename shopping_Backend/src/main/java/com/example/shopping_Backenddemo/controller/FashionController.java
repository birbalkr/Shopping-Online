package com.example.shopping_Backenddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping_Backenddemo.FashionItem;
import com.example.shopping_Backenddemo.service.FashionSerivce;

@RestController
@CrossOrigin("http://localhost:5173")
public class FashionController {
    
    @Autowired
    FashionSerivce fashionSerivce;


    
    @GetMapping("api/fashion")
    public List<FashionItem> getALLfashion() {
        return fashionSerivce.readFashions();
    }

    
    @GetMapping("api/fashion/{id}")
    public FashionItem readFashion(@PathVariable Long id) {
        return fashionSerivce.readFashion(id);
    }

    
    @PostMapping("add-fashion-api")
    public String createFashion(@RequestBody FashionItem fashionItem) {
        return fashionSerivce.createFashion(fashionItem);

    }

    
    @DeleteMapping("api/fashion/{id}")
    public String deleteFashion(@PathVariable Long id) {
        if (fashionSerivce.deleteFashion(id))
            return "Delete Successfully";
        return "Not found";
    }

    
    @PutMapping("add-fashion-api/{id}")
    public String updateFashion(@PathVariable Long id, @RequestBody FashionItem fashionItem) {
        return fashionSerivce.updateFashion(id, fashionItem);
    }
}
