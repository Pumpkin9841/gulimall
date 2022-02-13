package com.pumpkin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.gulimall.product.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:17:16
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

