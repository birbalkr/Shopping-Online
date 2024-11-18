package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.HomeKitchenItem;

public interface HomeKitchenSerivce {

    String createHome(HomeKitchenItem homeKitchenItem); 

    List<HomeKitchenItem> readHomes();

    boolean deleteHome(Long id);

    String updateHome(Long id, HomeKitchenItem homeKitchenItem);

    HomeKitchenItem readHome(Long id);
}
