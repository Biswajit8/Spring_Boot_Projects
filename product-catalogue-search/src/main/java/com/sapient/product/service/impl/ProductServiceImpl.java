package com.sapient.product.service.impl;

import com.sapient.product.entity.Product;
import com.sapient.product.repository.ProductRepository;
import com.sapient.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Optional<List<Product>> findProducts() {
        return Optional.of(productRepository.findAll());
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Optional<Product> findProduct(Integer id) {
        return productRepository.findById(id);
    }
}
