package com.hixtrip.sample.app.api;

import com.hixtrip.sample.client.order.dto.CommandOderCreateDTO;
import com.hixtrip.sample.client.order.dto.CommandPayDTO;
import com.hixtrip.sample.domain.order.model.Order;

/**
 * 订单的service层
 */
public interface OrderService {

    /**
     * 创建订单
     * @param commandOderCreateDTO
     */
    void createOrder(CommandOderCreateDTO commandOderCreateDTO);

    /**
     * 支付回调
     * @param commandPayDTO
     */
    void payCallback(CommandPayDTO commandPayDTO);
}
