package com.sapient.product.service;

import com.sapient.product.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<List<Product>> findProducts();

    void addProduct(Product product);

    Optional<Product> findProduct(Integer id);
}
