package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.ComputerItem;
import com.example.shopping_Backenddemo.entity.ProductComputerEntity;
import com.example.shopping_Backenddemo.repository.ComputerRepository;
import com.example.shopping_Backenddemo.service.ComputerSerivce;


@Service
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
            emp.setImage1(productComputerEntity.getImage1());
            emp.setImage2(productComputerEntity.getImage2());
            emp.setImage3(productComputerEntity.getImage3());
            emp.setCpumodel(productComputerEntity.getCpumodel());
            emp.setMemorystorage(productComputerEntity.getMemorystorage());
            emp.setReviews(productComputerEntity.getReviews());
            emp.setOperation(productComputerEntity.getOperation());

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
    
        ProductComputerEntity exestingcomputer = computerRepository.findById(id).get();
        exestingcomputer.setTitle(computerItem.getTitle());
        exestingcomputer.setDescription(computerItem.getDescription());
        exestingcomputer.setPrice(computerItem.getPrice());
        exestingcomputer.setImage1(computerItem.getImage1());
        exestingcomputer.setImage2(computerItem.getImage2());
        exestingcomputer.setImage3(computerItem.getImage3());
        exestingcomputer.setCpumodel(computerItem.getCpumodel());
        exestingcomputer.setMemorystorage(computerItem.getMemorystorage());
        exestingcomputer.setOperation(computerItem.getOperation());
        exestingcomputer.setReviews(computerItem.getReviews());
        computerRepository.save(exestingcomputer);
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
