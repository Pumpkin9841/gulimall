package com.pumpkin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.gulimall.product.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:17:17
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

