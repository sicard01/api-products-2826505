package com.api.java.api_products_2826505.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

import com.api.java.api_products_2826505.repositories.ProductRepository;
import com.api.java.api_products_2826505.entities.Product;

@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;
    List<Product>findAll(){
        return (List<Product>)
        repository.findAll();

    }

}
