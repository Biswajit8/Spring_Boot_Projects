package com.sapient.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Brand {

    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private Set<Product> products;
}
