package com.chj.mapper;

import com.chj.entity.OrderMaster;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author chj
 * @since 2020-08-22
 */
public interface OrderMasterMapper extends BaseMapper<OrderMaster> {
    public int cancel(String buyerId,String orderId);
    public int finish(String orderId);
    public int pay(String buyerId,String orderId);
    public int handler(Integer status,String orderId);

}
