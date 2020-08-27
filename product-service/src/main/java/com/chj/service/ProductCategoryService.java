package com.chj.service;

import com.chj.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chj.vo.ProductCategoryVO;
import com.chj.vo.ResultVO;

import java.util.List;

/**
 * <p>
 * 类目表 服务类
 * </p>
 *
 * @author chj
 * @since 2020-08-20
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    public ResultVO<List<ProductCategoryVO>> volist();
    public List<ProductCategoryVO> getAllCategoryVO();
}
