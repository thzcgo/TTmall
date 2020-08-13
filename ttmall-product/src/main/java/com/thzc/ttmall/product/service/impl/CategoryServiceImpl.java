package com.thzc.ttmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.Query;

import com.thzc.ttmall.product.dao.CategoryDao;
import com.thzc.ttmall.product.entity.CategoryEntity;
import com.thzc.ttmall.product.service.CategoryService;


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
    public List<CategoryEntity> listWithTree() {

        // 1.找到所有的一级分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 2. 组装成父子的树形结构

        // 2.1 找到所有的一级分类
        List<CategoryEntity> level1 = entities.stream()
                // 过滤
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                // 给每一个分类找它的子分类集合
                .map((menu)->{
                    menu.setChildren(getChildren(menu,entities));
                    return menu;
                })
                // 排序
                .sorted((menu1, menu2)->{
                    return (menu1.getSort()==null?0:menu1.getSort()) -
                            (menu2.getSort()==null?0:menu2.getSort());
                })
                // 收集
                .collect(Collectors.toList());

        return level1;

    }

    @Override
    public void removeByMenuIds(List<Long> asList) {
        //TODO 检查要删除的菜单是否被其他地方引用

        baseMapper.deleteBatchIds(asList);
    }

    // 递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream()
                // 在当前传过来的集合all找是root的子分类
                .filter(categoryEntity -> {
                    return categoryEntity.getParentCid().equals(root.getCatId()) ;
                })
                // 每个子分类可能下面还有子分类，递归调用此方法
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                })
                // 排序
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort()==null?0:menu1.getSort()) -
                            (menu2.getSort()==null?0:menu2.getSort());
                })
                //收集
                .collect(Collectors.toList());

        return children;
    }

}