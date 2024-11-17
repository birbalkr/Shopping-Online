package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.shopping_Backenddemo.ComputerItem;
import com.example.shopping_Backenddemo.entity.ProductComputerEntity;
import com.example.shopping_Backenddemo.repository.ComputerRepository;
import com.example.shopping_Backenddemo.service.ComputerSerivce;

public class ComputerServiceImp implements ComputerSerivce{


    @Autowired
    private ComputerRepository computerRepository;

    @Override
    public String createComputer(ComputerItem computerItem) {
        ProductComputerEntity productComputerEntity = new ProductComputerEntity();
        BeanUtils.copyProperties(computerItem, productComputerEntity);

        computerRepository.save(productComputerEntity);
        return "Saved";
       }

    @Override
    public List<ComputerItem> readComputers() {
        List<ProductComputerEntity> computerList = computerRepository.findAll();
        List<ComputerItem> computerItem = new ArrayList<>();
        
        for(ProductComputerEntity productComputerEntity : computerList){
            ComputerItem emp = new ComputerItem();
            emp.setTitle(productComputerEntity.getTitle());
            emp.setDescription(productComputerEntity.getDescription());
            emp.setPrice(productComputerEntity.getPrice());
            emp.setImage(productComputerEntity.getImage());
            emp.setReviews(productComputerEntity.getReviews());

            computerItem.add(emp);
        }
        return computerItem;
    }

    @Override
    public boolean deleteComputer(Long id) {
        ProductComputerEntity emp = computerRepository.findById(id).get();
        computerRepository.delete(emp);
        return true;
    }

    @Override
    public String updateComputer(Long id, ComputerItem computerItem) {
    
        ProductComputerEntity exestingBookItem = computerRepository.findById(id).get();
        exestingBookItem.setTitle(computerItem.getTitle());
        exestingBookItem.setDescription(computerItem.getDescription());
        exestingBookItem.setPrice(computerItem.getPrice());
        exestingBookItem.setImage(computerItem.getImage());
        exestingBookItem.setReviews(computerItem.getReviews());
        computerRepository.save(exestingBookItem);
        return "Update Succesfully";
    }

    @Override
    public ComputerItem readComputer(Long id) {
        ProductComputerEntity productComputerEntity = computerRepository.findById(id).get();
        ComputerItem computerItem = new ComputerItem();
        BeanUtils.copyProperties(productComputerEntity, computerItem);

        return computerItem;
    }
    
}
