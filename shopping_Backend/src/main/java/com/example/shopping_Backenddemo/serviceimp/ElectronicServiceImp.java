package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.ElectronicItem;
import com.example.shopping_Backenddemo.entity.ProductElectronicEntity;
import com.example.shopping_Backenddemo.repository.ElectronicRepository;
import com.example.shopping_Backenddemo.service.ElectronicSerivce;

@Service
public class ElectronicServiceImp implements ElectronicSerivce {

    @Autowired
    private ElectronicRepository electronicRepository;
    
    @Override
    public String createElectronic(ElectronicItem electronicItem) {
       ProductElectronicEntity productElectronicEntity = new ProductElectronicEntity();
        BeanUtils.copyProperties(electronicItem, productElectronicEntity);

        electronicRepository.save(productElectronicEntity);
        return "Saved";
    }

    @Override
    public List<ElectronicItem> readElectronics() {
     List<ProductElectronicEntity> electronicList = electronicRepository.findAll();
        List<ElectronicItem> electronicItems = new ArrayList<>();

        for (ProductElectronicEntity productElectronicEntity : electronicList) {

            ElectronicItem emp = new ElectronicItem();
            emp.setTitle(productElectronicEntity.getTitle());
            emp.setDescription(productElectronicEntity.getDescription());
            emp.setId(productElectronicEntity.getId());
            emp.setPrice(productElectronicEntity.getPrice());
            emp.setImage1(productElectronicEntity.getImage1());
            emp.setImage2(productElectronicEntity.getImage2());
            emp.setImage3(productElectronicEntity.getImage3());
            emp.setBrand(productElectronicEntity.getBrand());
            emp.setColor(productElectronicEntity.getColor());
            emp.setReviews(productElectronicEntity.getReviews());

            electronicItems.add(emp);
        }
        return electronicItems;    
    }

    @Override
    public boolean deleteElectronic(Long id) {
        ProductElectronicEntity emp = electronicRepository.findById(id).get();
        electronicRepository.delete(emp);
        return true;
    }

    @Override
    public String updateElectronic(Long id, ElectronicItem electronicItem) {
        ProductElectronicEntity exestingElectronicItem = electronicRepository.findById(id).get();
        exestingElectronicItem.setTitle(electronicItem.getTitle());
        exestingElectronicItem.setDescription(electronicItem.getDescription());
        exestingElectronicItem.setPrice(electronicItem.getPrice());
        exestingElectronicItem.setImage1(electronicItem.getImage1());
        exestingElectronicItem.setImage2(electronicItem.getImage2());
        exestingElectronicItem.setImage3(electronicItem.getImage3());
        exestingElectronicItem.setBrand(electronicItem.getBrand());
        exestingElectronicItem.setColor(electronicItem.getColor());
        exestingElectronicItem.setReviews(electronicItem.getReviews());
        electronicRepository.save(exestingElectronicItem);
        return "Update Succesfully";
    }

    @Override
    public ElectronicItem readElectronic(Long id) {
        ProductElectronicEntity productElectronicEntity = electronicRepository.findById(id).get();
        ElectronicItem electronicItem = new ElectronicItem();
        BeanUtils.copyProperties(productElectronicEntity, electronicItem);

        return electronicItem;
    }
    
}
