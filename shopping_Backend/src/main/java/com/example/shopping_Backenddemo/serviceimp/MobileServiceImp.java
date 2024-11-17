package com.example.shopping_Backenddemo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping_Backenddemo.MobileItem;
import com.example.shopping_Backenddemo.entity.ProductMobilesEntity;
import com.example.shopping_Backenddemo.repository.MobileRepository;
import com.example.shopping_Backenddemo.service.MobileSerivce;

@Service
public class MobileServiceImp implements MobileSerivce{
    
    @Autowired
    private MobileRepository mobileRepository;

    @Override
    public String createMobile(MobileItem mobileItem) {
        ProductMobilesEntity productMobilesEntity = new ProductMobilesEntity();
        BeanUtils.copyProperties(mobileItem, productMobilesEntity);

        mobileRepository.save(productMobilesEntity);
        return "Saved";
    }

    @Override
    public List<MobileItem> readMobiles() {
        List<ProductMobilesEntity> bookList = mobileRepository.findAll();
        List<MobileItem> mobileItem = new ArrayList<>();

        for (ProductMobilesEntity productMobilesEntity : bookList) {

            MobileItem emp = new MobileItem();
            emp.setTitle(productMobilesEntity.getTitle());
            emp.setDescription(productMobilesEntity.getDescription());
            emp.setId(productMobilesEntity.getId());
            emp.setPrice(productMobilesEntity.getPrice());
            emp.setImage(productMobilesEntity.getImage());
            emp.setReviews(productMobilesEntity.getReviews());

            mobileItem.add(emp);
        }
        return mobileItem;
    }

    @Override
    public boolean deleteMobile(Long id) {
        ProductMobilesEntity emp = mobileRepository.findById(id).get();
        mobileRepository.delete(emp);
        return true;
    }

    @Override
    public String updateMobile(Long id, MobileItem mobileItem) {
        ProductMobilesEntity exestingBookItem = mobileRepository.findById(id).get();
        exestingBookItem.setTitle(mobileItem.getTitle());
        exestingBookItem.setDescription(mobileItem.getDescription());
        exestingBookItem.setPrice(mobileItem.getPrice());
        exestingBookItem.setImage(mobileItem.getImage());
        exestingBookItem.setReviews(mobileItem.getReviews());
        mobileRepository.save(exestingBookItem);
        return "Update Succesfully";
    }

    @Override
    public MobileItem readMobile(Long id) {
        ProductMobilesEntity productMobilesEntity = mobileRepository.findById(id).get();
        MobileItem mobileItem = new MobileItem();
        BeanUtils.copyProperties(productMobilesEntity, mobileItem);

        return mobileItem;
    }
}
