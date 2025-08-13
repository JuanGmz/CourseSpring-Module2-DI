package com.juan.spring.diapp.repositories;

import com.juan.spring.diapp.models.Product;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Data
public class ProductRepository {
    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L, "Macbook Air M4", 1200.00),
                new Product(2L, "Iphone 16 Pro Max", 1000.00),
                new Product(3L, "Apple Watch Ultra", 800.00),
                new Product(4L, "Airpods Pro 2nd Generation", 250.00));
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        // Filter by Product, and if exists return first element, if not return a null
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}