package com.example.shopping_Backenddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping_Backenddemo.entity.ProductFitnessOutdoors;


@Repository
public interface FitnesslRepository extends JpaRepository<ProductFitnessOutdoors, Long> {
    
}
