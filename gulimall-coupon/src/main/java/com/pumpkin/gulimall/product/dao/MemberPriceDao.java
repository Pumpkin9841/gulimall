package com.pumpkin.gulimall.product.dao;

import com.pumpkin.gulimall.product.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:17:16
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
