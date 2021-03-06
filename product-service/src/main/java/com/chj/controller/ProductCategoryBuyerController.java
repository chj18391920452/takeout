package com.chj.controller;

import com.chj.service.ProductCategoryService;
import com.chj.vo.ProductCategoryVO;
import com.chj.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 类目表 前端控制器
 * </p>
 *
 * @author southwind
 * @since 2020-08-20
 */
@RestController
@RequestMapping("/buyer/product")
@Slf4j
public class ProductCategoryBuyerController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO<List<ProductCategoryVO>> list(){
        log.info("调用了{}端口的服务", this.port);
        return this.productCategoryService.volist();
    }

}

