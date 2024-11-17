package com.example.shopping_Backenddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping_Backenddemo.entity.ProductCarMotorbikeEntity;

@Repository
public interface CarMoterbikelRepository extends JpaRepository<ProductCarMotorbikeEntity, Long>{
    
}
