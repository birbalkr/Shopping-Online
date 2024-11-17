package com.example.shopping_Backenddemo.service;

import java.util.List;

import com.example.shopping_Backenddemo.ComputerItem;

public interface ComputerSerivce {

    String createComputer(ComputerItem computerItem);

    List<ComputerItem> readComputers();

    boolean deleteComputer(Long id);

    String updateComputer(Long id, ComputerItem computerItem);

    ComputerItem readComputer(Long id);
}
