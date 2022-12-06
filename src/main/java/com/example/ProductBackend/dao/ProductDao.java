package com.example.ProductBackend.dao;

import com.example.ProductBackend.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Integer> {
}
