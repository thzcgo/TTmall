package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.product.entity.CategoryEntity;
import com.thzc.ttmall.product.vo.Catelog2Vo;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:41
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeByMenuIds(List<Long> asList);

    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);

    List<CategoryEntity> getLevel1Categorys();

    Map<String, List<Catelog2Vo>> getCatelogJson();

    Map<String, List<Catelog2Vo>> getCatelogJsonFromDbWithLocaLock();
}

