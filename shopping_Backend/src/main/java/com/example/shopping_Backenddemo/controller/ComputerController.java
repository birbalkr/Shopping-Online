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

import com.example.shopping_Backenddemo.ComputerItem;
import com.example.shopping_Backenddemo.service.ComputerSerivce;

@RestController
// @CrossOrigin("http://localhost:5173")
public class ComputerController {

    @Autowired
    ComputerSerivce computerSerivce;

    @Value("${frontend.url}")
    private String frontendUrl;

    @CrossOrigin(origins = "${frontend.url}")
    @GetMapping("api/computer")
    public List<ComputerItem> getALLComputer() {
        return computerSerivce.readComputers();
    }

    @CrossOrigin(origins = "${frontend.url}")
    @GetMapping("api/computer/{id}")
    public ComputerItem readComputer(@PathVariable Long id) {
        return computerSerivce.readComputer(id);
    }

    @CrossOrigin(origins = "${frontend.url}")
    @PostMapping("add-computer-api")
    public String createComputer(@RequestBody ComputerItem computerItem) {
        return computerSerivce.createComputer(computerItem);

    }

    @CrossOrigin(origins = "${frontend.url}")
    @DeleteMapping("api/computer/{id}")
    public String deleteComputer(@PathVariable Long id) {
        if (computerSerivce.deleteComputer(id))
            return "Delete Successfully";
        return "Not found";
    }

    @CrossOrigin(origins = "${frontend.url}")
    @PutMapping("add-computer-api/{id}")
    public String updateComputer(@PathVariable Long id, @RequestBody ComputerItem computerItem) {
        return computerSerivce.updateComputer(id, computerItem);
    }
}
