package com.pumpkin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.gulimall.product.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:17:16
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

