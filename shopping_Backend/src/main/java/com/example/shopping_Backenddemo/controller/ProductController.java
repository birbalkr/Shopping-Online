package com.example.shopping_Backenddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping_Backenddemo.ProductItem;
import com.example.shopping_Backenddemo.service.ProductService;


@RestController
@CrossOrigin("http://localhost:5173")
public class ProductController {

    @Autowired
    ProductService productService;



    
    @GetMapping("api/product")
    public List<ProductItem> getALLProduct() {
        return productService.readProducts();
    }

    
    // Corrected: Use @PathVariable instead of @RequestParam
    @GetMapping("api/product/{id}")
    public ProductItem getProductById(@PathVariable Long id) {
        return productService.readProduct(id);
    }

    
    @PostMapping("add-product-api")
    public String createProduct(@RequestBody ProductItem productItem) {
        return productService.createProduct(productItem);

    }

    
    @DeleteMapping("api/product/{id}")
    public String deleteProduct(@PathVariable Long id) {
        if (productService.deleteProduct(id))
            return "Delete Successfully";
        return "Not found";
    }

    
    @PutMapping("add-product-api/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody ProductItem productItem) {
        return productService.updateProduct(id, productItem);
    }

    

}
