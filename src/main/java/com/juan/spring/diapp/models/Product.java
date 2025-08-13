package com.juan.spring.diapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;

// Lombok generate a constructor without args by default

// Generate getters and setters with lombok
@Data
// Generate a constructor with all args using lombok
@AllArgsConstructor
public class Product implements Cloneable {
    private Long id;
    private String name;
    private Double price;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(id, name, price);
        }
    }
}