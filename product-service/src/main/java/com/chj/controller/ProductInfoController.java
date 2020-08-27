package com.chj.controller;


import com.chj.entity.ProductInfo;
import com.chj.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author southwind
 * @since 2020-08-20
 */
@RestController
@RequestMapping("//productInfo")
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/list")
    public List<ProductInfo> list(){
        return this.productInfoService.list();
    }

}

