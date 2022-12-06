package com.example.ProductBackend.controller;

import com.example.ProductBackend.dao.ProductDao;
import com.example.ProductBackend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public  String addProducts(@RequestBody Products p){
        System.out.println(p.getProductCode().toString());
        System.out.println(p.getProductName().toString());
        System.out.println(p.getManDate().toString());
        System.out.println(p.getExpDate().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getPrice().toString());
        System.out.println(p.getSellerName().toString());
        System.out.println(p.getDistrinutorName().toString());

        dao.save(p);
        return "Product added Successfully ";
    }
}
