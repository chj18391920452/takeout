package com.chj.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ProductCategoryVO {
    private String name;
    private Integer type;
    private List<ProductInfoVO> foods;

    public ProductCategoryVO(String name, Integer type) {
        this.name = name;
        this.type = type;
    }
}
