package com.pumpkin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.gulimall.product.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:17:17
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

