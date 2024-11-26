package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.SportsItem;
import com.example.shopping_Backenddemo.entity.ProductSportsEntity;

import com.example.shopping_Backenddemo.repository.SportslRepository;
import com.example.shopping_Backenddemo.service.SportSerivce;


@Service
public class SportsServiceImp implements SportSerivce{
    @Autowired
    private SportslRepository sportslRepository;

    @Override
    public String createSport(SportsItem sportsItem) {
        ProductSportsEntity productSportsEntity = new ProductSportsEntity();
        BeanUtils.copyProperties(sportsItem, productSportsEntity);

        sportslRepository.save(productSportsEntity);
        return "Saved";
    }

    @Override
    public List<SportsItem> readSports() {
        List<ProductSportsEntity> bookList = sportslRepository.findAll();
        List<SportsItem> sportsItem = new ArrayList<>();

        for (ProductSportsEntity productSportsEntity : bookList) {

            SportsItem emp = new SportsItem();
            emp.setTitle(productSportsEntity.getTitle());
            emp.setDescription(productSportsEntity.getDescription());
            emp.setId(productSportsEntity.getId());
            emp.setPrice(productSportsEntity.getPrice());
            emp.setImage1(productSportsEntity.getImage1());
            emp.setImage2(productSportsEntity.getImage2());
            emp.setImage3(productSportsEntity.getImage3());
            emp.setBrand(productSportsEntity.getBrand());
            emp.setColor(productSportsEntity.getColor());
            emp.setMaterial(productSportsEntity.getMaterial());
            emp.setReviews(productSportsEntity.getReviews());

            sportsItem.add(emp);
        }
        return sportsItem;
    }

    @Override
    public boolean deleteSport(Long id) {
        ProductSportsEntity emp = sportslRepository.findById(id).get();
        sportslRepository.delete(emp);
        return true;
    }

    @Override
    public String updateSport(Long id, SportsItem sportsItem) {
        ProductSportsEntity exestingSport = sportslRepository.findById(id).get();
        exestingSport.setTitle(sportsItem.getTitle());
        exestingSport.setDescription(sportsItem.getDescription());
        exestingSport.setBrand(sportsItem.getBrand());
        exestingSport.setColor(sportsItem.getColor());
        exestingSport.setMaterial(sportsItem.getMaterial());
        exestingSport.setImage1(sportsItem.getImage1());
        exestingSport.setImage2(sportsItem.getImage2());
        exestingSport.setImage3(sportsItem.getImage3());
        exestingSport.setPrice(sportsItem.getPrice());
        exestingSport.setReviews(sportsItem.getReviews());
        sportslRepository.save(exestingSport);
        return "Update Succesfully";
    }

    @Override
    public SportsItem readSport(Long id) {
        ProductSportsEntity productSportsEntity = sportslRepository.findById(id).get();
        SportsItem sportsItem = new SportsItem();
        BeanUtils.copyProperties(productSportsEntity, sportsItem);

        return sportsItem;
    }

}
