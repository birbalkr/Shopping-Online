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
            emp.setImage(productSportsEntity.getImage());
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
        ProductSportsEntity exestingBookItem = sportslRepository.findById(id).get();
        exestingBookItem.setTitle(sportsItem.getTitle());
        exestingBookItem.setDescription(sportsItem.getDescription());
        exestingBookItem.setPrice(sportsItem.getPrice());
        exestingBookItem.setImage(sportsItem.getImage());
        exestingBookItem.setReviews(sportsItem.getReviews());
        sportslRepository.save(exestingBookItem);
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
