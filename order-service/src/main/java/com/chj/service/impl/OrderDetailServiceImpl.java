package com.chj.service.impl;

import com.chj.entity.OrderDetail;
import com.chj.mapper.OrderDetailMapper;
import com.chj.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单详情表 服务实现类
 * </p>
 *
 * @author chj
 * @since 2020-08-22
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
