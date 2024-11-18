package com.example.shopping_Backenddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping_Backenddemo.entity.ProductFashionEntity;


@Repository
public interface FashionlRepository extends JpaRepository<ProductFashionEntity, Long>{
    
}
