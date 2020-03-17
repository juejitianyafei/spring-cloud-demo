package com.king.seata.order.service;


import com.king.seata.order.model.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
