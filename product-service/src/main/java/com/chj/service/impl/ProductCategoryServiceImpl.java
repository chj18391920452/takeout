package com.chj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chj.entity.ProductCategory;
import com.chj.entity.ProductInfo;
import com.chj.mapper.ProductCategoryMapper;
import com.chj.mapper.ProductInfoMapper;
import com.chj.service.ProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chj.util.EntityToVO;
import com.chj.vo.ProductCategoryVO;
import com.chj.vo.ProductInfoVO;
import com.chj.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 类目表 服务实现类
 * </p>
 *
 * @author chj
 * @since 2020-08-20
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {
  @Autowired
  private ProductCategoryMapper productCategoryMapper;
  @Autowired
  private ProductInfoMapper productInfoMapper;
    @Override
    public ResultVO<List<ProductCategoryVO>> volist() {
        //首先先拿出所有的分类信息
        List<ProductCategory> productCategories = this.productCategoryMapper.selectList(null);
       //创建一个vo来存放转换的数据
        List<ProductCategoryVO> result = new ArrayList<>();
        ProductCategoryVO productCategoryVO;
        for (ProductCategory productCategory : productCategories) {
            productCategoryVO=new ProductCategoryVO();
            //取出商品的信息分类   并按照映射存入前端视图的vo 中
            productCategoryVO.setName(productCategory.getCategoryName());
            productCategoryVO.setType(productCategory.getCategoryType());
          //条件查询根据分类的id去查找属于我自己ID的商品信息
            //要用到条件查询     querywrapper
            QueryWrapper Wrapper = new QueryWrapper<>();
            Wrapper.eq("category_type",productCategoryVO.getType());
            Wrapper.eq("product_status",1);
            //把查询到的属于自己的商品信息 赋给前端页面
            List<ProductInfo> ProductInfos = this.productInfoMapper.selectList(Wrapper);
            //创建一个VO
            List<ProductInfoVO> productInfoVOS = new ArrayList<>();
            for (ProductInfo productInfo : ProductInfos) {
                productInfoVOS.add(EntityToVO.ProductInfoToProductInfoVO(productInfo));
            }
             productCategoryVO.setFoods(productInfoVOS);
            result.add(productCategoryVO);
        }
        ResultVO<List<ProductCategoryVO>> resultVO = new ResultVO<>();

        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(result);
        return resultVO;
    }

    @Override
    public List<ProductCategoryVO> getAllCategoryVO() {
        List<ProductCategory> productCategories = this.productCategoryMapper.selectList(null);
        List<ProductCategoryVO> result = productCategories.stream().map(e -> new ProductCategoryVO(e.getCategoryName(), e.getCategoryType())).collect(Collectors.toList());
        return result;
    }
}
