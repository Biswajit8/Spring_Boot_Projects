package com.sapient.product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private double price;
    private Integer quantity;
    private String size;

    private Integer brand_id;

    private Integer color_id;

    private Integer category_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false, name = "brand_id")
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false, name = "color_id")
    private Color color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false, name = "category_id")
    private ProductCategory productCategory;

}
