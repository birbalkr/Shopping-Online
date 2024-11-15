package com.example.shopping_Backenddemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {
   
   private Long id;
   private String title;
   private String description;
   private String price; 
}
