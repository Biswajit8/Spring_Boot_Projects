package com.sapient.product.service.impl;

import com.sapient.product.entity.Brand;
import com.sapient.product.repository.BrandRepository;
import com.sapient.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;
    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }
}
