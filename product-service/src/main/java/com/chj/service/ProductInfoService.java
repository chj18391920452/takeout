package com.chj.service;

import com.chj.entity.ProductInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chj.vo.PageVO;
import com.chj.vo.ProductManageVO;

import java.util.List;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author chj
 * @since 2020-08-20
 */
public interface ProductInfoService extends IService<ProductInfo> {
    public boolean subStock(Integer productId,Integer quantity);
    public PageVO<List<ProductManageVO>> findProductManageVOByPage(Integer page, Integer size);
    public ProductManageVO findById(Integer id);
    public boolean updateProductManageVO(ProductManageVO productManageVO);
    public boolean updateStatus(Integer id,Boolean status);
}
