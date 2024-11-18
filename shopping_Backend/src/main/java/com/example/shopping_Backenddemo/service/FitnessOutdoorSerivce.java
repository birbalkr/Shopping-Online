package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.FitnessOutdoorItem;

public interface FitnessOutdoorSerivce {
    String createFitness(FitnessOutdoorItem fitnessOutdoorItem); 

    List<FitnessOutdoorItem> readFitnesss();

    boolean deleteFitness(Long id);

    String updateFitness(Long id, FitnessOutdoorItem fitnessOutdoorItem);

    FitnessOutdoorItem readFitness(Long id);
}
