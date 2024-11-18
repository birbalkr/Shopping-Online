package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.SellItem;

public interface SellService {
    String createSell(SellItem sellItem); 

    List<SellItem> readSells();

    boolean deleteSell(Long id);

    String updateSell(Long id, SellItem sellItem);

    SellItem readSell(Long id);
}
