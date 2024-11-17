package com.example.shopping_Backenddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping_Backenddemo.entity.ProductElectronicEntity;

public interface ElectronicRepository extends JpaRepository<ProductElectronicEntity, Long>{
    
}
