package com.pumpkin.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.common.utils.Query;

import com.pumpkin.gulimall.product.dao.CategoryDao;
import com.pumpkin.gulimall.product.entity.CategoryEntity;
import com.pumpkin.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWiterTree() {
        //继承的ServiceImpl<CategoryDao, CategoryEntity>，第一个泛型是CategoryDao，所以就是baseMapper
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> treeCategory = entities.stream().filter(one ->
                one.getParentCid() == 0
        ).map((menu)->{
            menu.setChildren(getChildren(menu , entities));
            return menu ;
        }).sorted(((o1, o2) -> {
            return (o1.getSort() == null ? 0 : o1.getSort()) - (o2.getSort() == null ? 0 : o2.getSort());
        })).collect(Collectors.toList());
        return treeCategory;
    }

    private List<CategoryEntity> getChildren(CategoryEntity menu, List<CategoryEntity> entities) {
        List<CategoryEntity> children = entities.stream().filter(one ->
                one.getParentCid() == menu.getCatId()
        ).map(one -> {
            one.setChildren(getChildren(one, entities));
            return one;
        }).sorted(((o1, o2) -> {
            return (o1.getSort() == null ? 0 : o1.getSort()) - (o2.getSort() == null ? 0 : o2.getSort());
        })).collect(Collectors.toList());
        return children ;
    }

}