package com.pumpkin.gulimall.product.dao;

import com.pumpkin.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-23 23:07:09
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
