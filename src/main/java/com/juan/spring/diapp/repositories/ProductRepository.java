package com.juan.spring.diapp.repositories;

import com.juan.spring.diapp.models.Product;

import java.util.List;

public interface ProductRepository {
    public List<Product> findAll();
    public Product findById(Long id);
}