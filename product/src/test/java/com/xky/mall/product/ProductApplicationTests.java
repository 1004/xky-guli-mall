package com.xky.mall.product;

import com.xky.mall.product.entity.BrandEntity;
import com.xky.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        List<BrandEntity> list = brandService.list();
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
