package com.sapient.product.controller;

import com.sapient.product.exception.ProductNotFoundException;
import com.sapient.product.entity.Product;
import com.sapient.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findProduct/{id}")
    public ResponseEntity<Product> findProduct(@PathVariable Integer id) {
        Optional<Product> product = productService.findProduct(id);

        if(product.isEmpty()) {
            throw new ProductNotFoundException("Product not found");
        }

        return new ResponseEntity<>(product.get(), HttpStatus.OK);
    }

    @GetMapping("/findAllProducts")
    public ResponseEntity<List<Product>> findProducts() {
        Optional<List<Product>> products = productService.findProducts();

        if(products.isEmpty()) {
            throw new ProductNotFoundException("Product not found");
        }

        return new ResponseEntity<>(products.get(), HttpStatus.OK);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody Product product) {

        productService.addProduct(product);

        return new ResponseEntity<>("Product added", HttpStatus.CREATED);
    }

}
