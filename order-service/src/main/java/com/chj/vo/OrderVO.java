package com.chj.vo;

import com.chj.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderVO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus = 0;
    private Integer payStatus = 0;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private List<OrderDetail> orderDetailList;
}
