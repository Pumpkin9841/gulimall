package com.pumpkin.gulimall.product;

import com.pumpkin.gulimall.product.entity.BrandEntity;
import com.pumpkin.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService ;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setName("小米");
        entity.setDescript("小米11 pro");
        boolean save = brandService.save(entity);
        System.out.println("保存成功");
    }

}
