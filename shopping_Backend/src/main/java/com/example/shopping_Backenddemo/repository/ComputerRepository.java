package com.example.shopping_Backenddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping_Backenddemo.entity.ProductComputerEntity;

public interface ComputerRepository extends JpaRepository<ProductComputerEntity, Long> {
    
}
