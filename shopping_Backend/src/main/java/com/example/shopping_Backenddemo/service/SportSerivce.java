package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.SportsItem;

public interface SportSerivce {
    String createSport(SportsItem sportsItem); 

    List<SportsItem> readSports();

    boolean deleteSport(Long id);

    String updateSport(Long id, SportsItem SportsItem);

    SportsItem readSport(Long id);
}
