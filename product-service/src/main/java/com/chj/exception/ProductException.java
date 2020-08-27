package com.chj.exception;


import com.chj.enums.ProductEnum;

public class ProductException extends RuntimeException {
    public ProductException(ProductEnum productEnum) {
        super(productEnum.getMsg());
    }
}
