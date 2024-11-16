package com.example.shopping_Backenddemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="user")
public class AuthEntity {

    private String name;
    private String email;
    private String phone;
    private String passwd;
}
