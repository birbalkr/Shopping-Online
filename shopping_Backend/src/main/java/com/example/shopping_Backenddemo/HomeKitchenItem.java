package com.example.shopping_Backenddemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeKitchenItem {
    
    private Long id;
    private String title;
    private String description;
    private String price;
    private String image1;
    private String image2;
    private String image3;
    private String brand;
    private String netQuantity;
    private String reviews;
}
