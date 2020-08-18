package com.thzc.ttmall.product.feign;

import com.thzc.common.to.SkuReductionTo;
import com.thzc.common.to.SpuBoundTo;
import com.thzc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ttmall-coupon")
public interface CouponFeignService {

        @PostMapping("/coupon/spubounds/save")
        R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

        @PostMapping("/coupon/skufullreduction/saveinfo")
        R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
