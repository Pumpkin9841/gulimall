package com.pumpkin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.gulimall.product.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:17:16
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

