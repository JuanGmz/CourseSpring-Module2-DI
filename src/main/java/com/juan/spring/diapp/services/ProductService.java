package com.juan.spring.diapp.services;

import com.juan.spring.diapp.models.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(Long id);
}