package com.sapient.product.controller;

import com.sapient.product.entity.Brand;
import com.sapient.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public ResponseEntity<List<Brand>> findAll() {
        List<Brand> brands = brandService.findAll();

        return new ResponseEntity<>(brands, HttpStatus.OK);
    }
}
