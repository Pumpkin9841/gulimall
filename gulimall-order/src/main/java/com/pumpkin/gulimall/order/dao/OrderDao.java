package com.pumpkin.gulimall.order.dao;

import com.pumpkin.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 15:47:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
