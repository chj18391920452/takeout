package com.chj.service;

import com.chj.entity.OrderMaster;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chj.form.OrderForm;
import com.chj.vo.OrderVO;
import com.chj.vo.PageVO;

import java.util.List;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author chj
 * @since 2020-08-22
 */
public interface OrderMasterService extends IService<OrderMaster> {
  public String create(OrderForm orderForm);
  public OrderVO getVOByBuyerIdAndOrderId(String buyerId,String orderId);
  public List<OrderVO> getVOListByBuyerId(String buyerId,Integer current,Integer size);
  public boolean cancel(String buyerId,String orderId);
  public boolean finish(String orderId);
  public boolean pay(String buyerId,String orderId);
  public PageVO<List<OrderMaster>> getOrderByPage(Integer page,Integer size);
  public  boolean handler(String type,String orderId);
}
