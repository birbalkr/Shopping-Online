package com.example.shopping_Backenddemo.Auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAuth {
    private String name;
    private String email;
    private String phone;
    private String passwd;
}
