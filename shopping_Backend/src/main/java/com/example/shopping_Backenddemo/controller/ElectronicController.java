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

import com.example.shopping_Backenddemo.ElectronicItem;
import com.example.shopping_Backenddemo.service.ElectronicSerivce;

@RestController
public class ElectronicController {
    
    @Autowired
    ElectronicSerivce electronicSerivce;

    @GetMapping("api/electronic")
    public List<ElectronicItem> getALLelectronic() {
        return electronicSerivce.readElectronics();
    }

    @GetMapping("api/electronic/{id}")
    public ElectronicItem readElectronic(@PathVariable Long id) {
        return electronicSerivce.readElectronic(id);
    }

    @PostMapping("api/electronic")
    public String createElectronic(@RequestBody ElectronicItem electronicItem) {
        return electronicSerivce.createElectronic(electronicItem);

    }

    @DeleteMapping("api/carMotorbike/{id}")
    public String deleteElectronic(@PathVariable Long id) {
        if (electronicSerivce.deleteElectronic(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/electronic/{id}")
    public String updateElectronic(@PathVariable Long id, @RequestBody ElectronicItem electronicItem) {
        return electronicSerivce.updateElectronic(id, electronicItem);
    }
}