package com.thzc.common.to.es;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class SkuEsModel {

    private Long skuId;

    private  Long spuId;

    private  String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    /**
     * 是否有库存
     * */
    private Boolean hasStock;

    private Long hotScore;

    private Long brandId;

    private Long catelogId;

    private String brandName;

    private String brandImg;

    private String catelogName;

    private List<Attrs> attrs;

    @Data
    public static class Attrs{
        private Long attrId;
        private String attrName;
        private String attrValue;
    }

}
