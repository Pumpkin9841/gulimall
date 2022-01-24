package com.pumpkin.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 15:47:31
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

