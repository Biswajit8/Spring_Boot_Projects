package com.sapient.product.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String msg) {
        super(msg);
    }
}
