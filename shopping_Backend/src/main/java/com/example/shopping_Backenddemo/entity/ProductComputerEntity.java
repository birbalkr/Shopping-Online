package com.example.shopping_Backenddemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="computer")
public class ProductComputerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String price;
    private String image1;
    private String image2;
    private String image3;
    private String operation;
    private String cpumodel;
    private String memorystorage;
    private String reviews;
}
