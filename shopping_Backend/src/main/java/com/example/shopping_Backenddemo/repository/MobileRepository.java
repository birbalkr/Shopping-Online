package com.example.shopping_Backenddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping_Backenddemo.entity.ProductMobilesEntity;

public  interface MobileRepository extends JpaRepository<ProductMobilesEntity, Long>{
    
}
