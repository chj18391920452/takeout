package com.chj.util;

import com.chj.entity.ProductInfo;
import com.chj.vo.ProductInfoVO;

public class EntityToVO {
    public static ProductInfoVO ProductInfoToProductInfoVO(ProductInfo productInfo){
        ProductInfoVO result = new ProductInfoVO();
        result.setId(productInfo.getProductId());
        result.setName(productInfo.getProductName());
        result.setDecription(productInfo.getProductDescription());
        result.setPrice(productInfo.getProductPrice());
        result.setIcon(productInfo.getProductIcon());
        result.setStock(productInfo.getProductStock());
        return result;
    }
}
