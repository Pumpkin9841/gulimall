package com.pumpkin.gulimall.member.dao;

import com.pumpkin.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:39:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
