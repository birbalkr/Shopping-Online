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

import com.example.shopping_Backenddemo.HomeKitchenItem;
import com.example.shopping_Backenddemo.service.HomeKitchenSerivce;

@RestController
@CrossOrigin("http://localhost:5173")
public class HomeKitchenController {
    
    @Autowired
    HomeKitchenSerivce homeKitchenSerivce;

    @Value("${frontend.url}")
    private String frontendUrl;

    @CrossOrigin(origins = "${frontend.url}")
    @GetMapping("api/homekitchen")
    public List<HomeKitchenItem> getALLHomeKitchen() {
        return homeKitchenSerivce.readHomes();
    }

    @CrossOrigin(origins = "${frontend.url}")
    @GetMapping("api/homekitchen/{id}")
    public HomeKitchenItem readHome(@PathVariable Long id) {
        return homeKitchenSerivce.readHome(id);
    }

    @CrossOrigin(origins = "${frontend.url}")
    @PostMapping("add-homekitchen-api")
    public String createHome(@RequestBody HomeKitchenItem homeKitchenItem) {
        return homeKitchenSerivce.createHome(homeKitchenItem);

    }

    @CrossOrigin(origins = "${frontend.url}")
    @DeleteMapping("api/homekitchen/{id}")
    public String deleteHome(@PathVariable Long id) {
        if (homeKitchenSerivce.deleteHome(id))
            return "Delete Successfully";
        return "Not found";
    }

    @CrossOrigin(origins = "${frontend.url}")
    @PutMapping("add-homekitchen-api/{id}")
    public String updateHome(@PathVariable Long id, @RequestBody HomeKitchenItem homeKitchenItem) {
        return homeKitchenSerivce.updateHome(id, homeKitchenItem);
    }
}
