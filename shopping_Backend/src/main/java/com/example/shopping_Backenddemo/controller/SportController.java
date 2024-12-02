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

import com.example.shopping_Backenddemo.SportsItem;
import com.example.shopping_Backenddemo.service.SportSerivce;

@RestController
// @CrossOrigin("http://localhost:5173")
public class SportController {

    @Autowired
    SportSerivce sportSerivce;

    @Value("${frontend.url}")
    private String frontendUrl;

    @CrossOrigin(origins = "${frontend.url}")
    @GetMapping("api/sport")
    public List<SportsItem> getALLSports() {
        return sportSerivce.readSports();
    }

    @CrossOrigin(origins = "${frontend.url}")
    @GetMapping("api/sport/{id}")
    public SportsItem readSport(@PathVariable Long id) {
        return sportSerivce.readSport(id);
    }

    @CrossOrigin(origins = "${frontend.url}")
    @PostMapping("add-sport-api")
    public String createSport(@RequestBody SportsItem sellItem) {
        return sportSerivce.createSport(sellItem);

    }

    @CrossOrigin(origins = "${frontend.url}")
    @DeleteMapping("api/sport/{id}")
    public String deleteSport(@PathVariable Long id) {
        if (sportSerivce.deleteSport(id))
            return "Delete Successfully";
        return "Not found";
    }

    @CrossOrigin(origins = "${frontend.url}")
    @PutMapping("add-sport-api/{id}")
    public String updateSport(@PathVariable Long id, @RequestBody SportsItem sportsItem) {
        return sportSerivce.updateSport(id, sportsItem);
    }
}
