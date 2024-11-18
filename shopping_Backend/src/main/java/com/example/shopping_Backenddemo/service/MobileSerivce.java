package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.MobileItem;

public interface MobileSerivce {

    String createMobile(MobileItem mobileItem); 

    List<MobileItem> readMobiles();

    boolean deleteMobile(Long id);

    String updateMobile(Long id, MobileItem mobileItem);

    MobileItem readMobile(Long id);
}