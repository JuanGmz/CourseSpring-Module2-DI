package com.juan.spring.diapp.repositories;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.juan.spring.diapp.models.Product;

@Repository
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L, "Macbook Air M4", 1200.00));
    }

    @Override
    public Product findById(Long id) {
        return new Product(1L, "Macbook Air M4", 1200.00);
    }
}