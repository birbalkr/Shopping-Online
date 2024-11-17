package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.ElectronicItem;

public interface ElectronicSerivce {

    String createElectronic(ElectronicItem electronicItem); 

    List<ElectronicItem> readElectronics();

    boolean deleteElectronic(Long id);

    String updateElectronic(Long id, ElectronicItem electronicItem);

    ElectronicItem readElectronic(Long id);
}
