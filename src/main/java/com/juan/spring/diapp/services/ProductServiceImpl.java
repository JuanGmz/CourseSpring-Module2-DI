package com.juan.spring.diapp.services;

import com.juan.spring.diapp.models.Product;
import com.juan.spring.diapp.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p -> {
            Double newPrice = p.getPrice() * 1.25;

            // Principle of immutability
            // Not functional with Cloneable
            // Product newProduct = new Product(p.getId(), p.getName(), newPrice);

            // Clone the product with the same data, and then can modify the clone
            // Cast to product, the method clone is type Object, so is necessary to cast to Product
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(newPrice);

            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}