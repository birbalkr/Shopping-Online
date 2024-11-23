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

import com.example.shopping_Backenddemo.SportsItem;
import com.example.shopping_Backenddemo.service.SportSerivce;

@RestController
public class SportController {

    @Autowired
    SportSerivce sportSerivce;

    @GetMapping("api/sport")
    public List<SportsItem> getALLSports() {
        return sportSerivce.readSports();
    }

    @GetMapping("api/sport/{id}")
    public SportsItem readSport(@PathVariable Long id) {
        return sportSerivce.readSport(id);
    }

    @PostMapping("add-sport-api")
    public String createSport(@RequestBody SportsItem sellItem) {
        return sportSerivce.createSport(sellItem);

    }

    @DeleteMapping("api/sport/{id}")
    public String deleteSport(@PathVariable Long id) {
        if (sportSerivce.deleteSport(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("add-sport-api/{id}")
    public String updateSport(@PathVariable Long id, @RequestBody SportsItem sportsItem) {
        return sportSerivce.updateSport(id, sportsItem);
    }
}
