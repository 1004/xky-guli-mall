package com.xky.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xky.common.utils.PageUtils;
import com.xky.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:10:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

