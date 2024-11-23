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

import com.example.shopping_Backenddemo.MobileItem;
import com.example.shopping_Backenddemo.service.MobileSerivce;

@RestController
public class mobileController {
    
    @Autowired
    MobileSerivce mobileSerivce;


@GetMapping("api/mobile")
    public List<MobileItem> getALLMobile() {
        return mobileSerivce.readMobiles();
    }

    @GetMapping("api/mobile/{id}")
    public MobileItem readMobile(@PathVariable Long id) {
        return mobileSerivce.readMobile(id);
    }

    @PostMapping("add-mobile-api")
    public String createMobile(@RequestBody MobileItem mobileItem) {
        return mobileSerivce.createMobile(mobileItem);

    }

    @DeleteMapping("api/mobile/{id}")
    public String deleteMobile(@PathVariable Long id) {
        if (mobileSerivce.deleteMobile(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("add-mobile-api/{id}")
    public String updateMobile(@PathVariable Long id, @RequestBody MobileItem mobileItem) {
        return mobileSerivce.updateMobile(id, mobileItem);
    }

}
