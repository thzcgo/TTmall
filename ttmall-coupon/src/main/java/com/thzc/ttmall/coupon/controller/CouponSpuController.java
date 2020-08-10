package com.thzc.ttmall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thzc.ttmall.coupon.entity.CouponSpuEntity;
import com.thzc.ttmall.coupon.service.CouponSpuService;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.R;



/**
 * 优惠券与产品关联
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 10:45:15
 */
@RestController
@RequestMapping("coupon/couponspu")
public class CouponSpuController {
    @Autowired
    private CouponSpuService couponSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("coupon:couponspu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("coupon:couponspu:info")
    public R info(@PathVariable("id") Long id){
		CouponSpuEntity couponSpu = couponSpuService.getById(id);

        return R.ok().put("couponSpu", couponSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("coupon:couponspu:save")
    public R save(@RequestBody CouponSpuEntity couponSpu){
		couponSpuService.save(couponSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
 //   @RequiresPermissions("coupon:couponspu:update")
    public R update(@RequestBody CouponSpuEntity couponSpu){
		couponSpuService.updateById(couponSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("coupon:couponspu:delete")
    public R delete(@RequestBody Long[] ids){
		couponSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
