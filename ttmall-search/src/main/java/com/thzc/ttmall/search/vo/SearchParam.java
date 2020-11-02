package com.thzc.ttmall.search.vo;

import lombok.Data;

import java.util.List;

/**
 * 封装页面可能传递过来的查询条件
 */
@Data
public class SearchParam {

    /**
     * 页面传过来的全文匹配关键字
     */
    private String keyword;

    /**
     * 三级分类ID
     */
    private Long catalog3Id;

    /**
     * 排序条件(saleCount（销量）、hotScore（热度分）、skuPrice（价格）)
     * 自定义排序条件
     *  sort = saleCount_asc/desc
     *  sort = hotScore_asc/desc
     *  sort = skuPrice_asc/desc
     */
    private String sort;

    /**
     * 是否有库存(0表示无库存，1表示有库存)
     * hasStock = 0/1
     */
    private Integer hasStock;

    /**
     * 价格区间查询
     * skuPrice = 1_500/_500/500_
     */
    private String skuPrice;

    /**
     * 商品ID
     */
    private List<Long> brandId;

    /**
     * 按照属性进行筛选
     * attrs = 2_5寸:6寸
     */
    private List<String> attrs;

    /**
     * 页码
     */
    private Integer pageNum;
}