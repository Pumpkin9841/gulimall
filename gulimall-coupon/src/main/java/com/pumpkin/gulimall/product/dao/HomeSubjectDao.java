package com.pumpkin.gulimall.product.dao;

import com.pumpkin.gulimall.product.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:17:17
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
