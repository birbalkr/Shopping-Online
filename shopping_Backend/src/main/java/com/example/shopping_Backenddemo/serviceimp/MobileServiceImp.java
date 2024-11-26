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
public class MobileServiceImp implements MobileSerivce {

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
            emp.setImage1(productMobilesEntity.getImage1());
            emp.setImage2(productMobilesEntity.getImage2());
            emp.setImage3(productMobilesEntity.getImage3());
            emp.setBrand(productMobilesEntity.getBrand());
            emp.setOpreatingSystem(productMobilesEntity.getOpreatingSystem());
            emp.setRam(productMobilesEntity.getRam());
            emp.setCupModel(productMobilesEntity.getCupModel());
            emp.setCupSpeed(productMobilesEntity.getCupSpeed());
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
        ProductMobilesEntity exestingmobile = mobileRepository.findById(id).get();
        exestingmobile.setTitle(mobileItem.getTitle());
        exestingmobile.setDescription(mobileItem.getDescription());
        exestingmobile.setId(mobileItem.getId());
        exestingmobile.setPrice(mobileItem.getPrice());
        exestingmobile.setImage1(mobileItem.getImage1());
        exestingmobile.setImage2(mobileItem.getImage2());
        exestingmobile.setImage3(mobileItem.getImage3());
        exestingmobile.setBrand(mobileItem.getBrand());
        exestingmobile.setOpreatingSystem(mobileItem.getOpreatingSystem());
        exestingmobile.setRam(mobileItem.getRam());
        exestingmobile.setCupModel(mobileItem.getCupModel());
        exestingmobile.setCupSpeed(mobileItem.getCupSpeed());
        exestingmobile.setReviews(mobileItem.getReviews());
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
