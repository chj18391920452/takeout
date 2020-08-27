package com.chj.exception;

import com.chj.enums.OrderEnum;

public class OrderException extends RuntimeException {

    public OrderException(OrderEnum orderEnum) {
        super(orderEnum.getMsg());
    }
}
