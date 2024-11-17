package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.FitnessOutdoorItem;
import com.example.shopping_Backenddemo.entity.ProductFitnessOutdoors;
import com.example.shopping_Backenddemo.repository.FitnesslRepository;
import com.example.shopping_Backenddemo.service.FitnessOutdoorSerivce;

@Service
public class fitnessOutdoorsServiceImp implements FitnessOutdoorSerivce{
    
    @Autowired
    private FitnesslRepository fitnesslRepository;

    @Override
    public String createFitness(FitnessOutdoorItem fitnessOutdoorItem) {
        ProductFitnessOutdoors productFitnessOutdoors = new ProductFitnessOutdoors();
        BeanUtils.copyProperties(fitnessOutdoorItem, productFitnessOutdoors);

        fitnesslRepository.save(productFitnessOutdoors);
        return "Saved";
    }

    @Override
    public List<FitnessOutdoorItem> readFitness() {
        List<ProductFitnessOutdoors> bookList = fitnesslRepository.findAll();
        List<FitnessOutdoorItem> fitnessOutdoorItem = new ArrayList<>();

        for (ProductFitnessOutdoors productFitnessOutdoors : bookList) {

            FitnessOutdoorItem emp = new FitnessOutdoorItem();
            emp.setTitle(productFitnessOutdoors.getTitle());
            emp.setDescription(productFitnessOutdoors.getDescription());
            emp.setId(productFitnessOutdoors.getId());
            emp.setPrice(productFitnessOutdoors.getPrice());
            emp.setImage(productFitnessOutdoors.getImage());
            emp.setReviews(productFitnessOutdoors.getReviews());

            fitnessOutdoorItem.add(emp);
        }
        return fitnessOutdoorItem;
    }

    @Override
    public boolean deleteFitnesss(Long id) {
        ProductFitnessOutdoors emp = fitnesslRepository.findById(id).get();
        fitnesslRepository.delete(emp);
        return true;
    }

    @Override
    public String updateFitness(Long id, FitnessOutdoorItem fitnessOutdoorItem) {
        ProductFitnessOutdoors exestingBookItem = fitnesslRepository.findById(id).get();
        exestingBookItem.setTitle(fitnessOutdoorItem.getTitle());
        exestingBookItem.setDescription(fitnessOutdoorItem.getDescription());
        exestingBookItem.setPrice(fitnessOutdoorItem.getPrice());
        exestingBookItem.setImage(fitnessOutdoorItem.getImage());
        exestingBookItem.setReviews(fitnessOutdoorItem.getReviews());
        fitnesslRepository.save(exestingBookItem);
        return "Update Succesfully";
    }

    @Override
    public FitnessOutdoorItem readFitness(Long id) {
        ProductFitnessOutdoors productFitnessOutdoors = fitnesslRepository.findById(id).get();
        FitnessOutdoorItem fitnessOutdoorItem = new FitnessOutdoorItem();
        BeanUtils.copyProperties(productFitnessOutdoors, fitnessOutdoorItem);

        return fitnessOutdoorItem;
    }

}
