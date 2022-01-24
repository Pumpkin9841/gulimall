package com.pumpkin.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 15:47:32
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

