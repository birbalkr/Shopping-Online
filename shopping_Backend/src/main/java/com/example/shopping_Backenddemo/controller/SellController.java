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

import com.example.shopping_Backenddemo.SellItem;
import com.example.shopping_Backenddemo.service.SellService;

@RestController
public class SellController {
    
    @Autowired
    SellService sellService;

    @GetMapping("api/sell")
    public List<SellItem> getALLSell() {
        return sellService.readSells();
    }

    @GetMapping("api/sell/{id}")
    public SellItem readSell(@PathVariable Long id) {
        return sellService.readSell(id);
    }

    @PostMapping("add-sell-api")
    public String createSell(@RequestBody SellItem sellItem) {
        return sellService.createSell(sellItem);

    }

    @DeleteMapping("api/sell/{id}")
    public String deleteSell(@PathVariable Long id) {
        if (sellService.deleteSell(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("add-sell-api/{id}")
    public String updateSell(@PathVariable Long id, @RequestBody SellItem sellItem) {
        return sellService.updateSell(id, sellItem);
    }

}
