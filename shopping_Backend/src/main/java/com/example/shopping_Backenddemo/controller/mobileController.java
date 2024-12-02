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

import com.example.shopping_Backenddemo.MobileItem;
import com.example.shopping_Backenddemo.service.MobileSerivce;

@RestController
// @CrossOrigin("http://localhost:5173")
public class mobileController {

    @Autowired
    MobileSerivce mobileSerivce;

    @Value("${frontend.url}")
    private String frontendUrl;

    @CrossOrigin(origins = "${frontend.url}")
    @GetMapping("api/mobile")
    public List<MobileItem> getALLMobile() {
        return mobileSerivce.readMobiles();
    }

    @CrossOrigin(origins = "${frontend.url}")
    @GetMapping("api/mobile/{id}")
    public MobileItem readMobile(@PathVariable Long id) {
        return mobileSerivce.readMobile(id);
    }

    @CrossOrigin(origins = "${frontend.url}")
    @PostMapping("add-mobile-api")
    public String createMobile(@RequestBody MobileItem mobileItem) {
        return mobileSerivce.createMobile(mobileItem);

    }

    @CrossOrigin(origins = "${frontend.url}")
    @DeleteMapping("api/mobile/{id}")
    public String deleteMobile(@PathVariable Long id) {
        if (mobileSerivce.deleteMobile(id))
            return "Delete Successfully";
        return "Not found";
    }

    @CrossOrigin(origins = "${frontend.url}")
    @PutMapping("add-mobile-api/{id}")
    public String updateMobile(@PathVariable Long id, @RequestBody MobileItem mobileItem) {
        return mobileSerivce.updateMobile(id, mobileItem);
    }

}
