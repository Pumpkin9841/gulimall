package com.pumpkin.gulimall.product.dao;

import com.pumpkin.gulimall.product.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:17:17
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
