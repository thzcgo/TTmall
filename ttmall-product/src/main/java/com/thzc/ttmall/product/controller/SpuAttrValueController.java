package com.thzc.ttmall.product.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thzc.ttmall.product.entity.SpuAttrValueEntity;
import com.thzc.ttmall.product.service.SpuAttrValueService;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.R;



/**
 * spu属性值
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:43
 */
@RestController
@RequestMapping("product/spuattrvalue")
public class SpuAttrValueController {
    @Autowired
    private SpuAttrValueService spuAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("product:spuattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("product:spuattrvalue:info")
    public R info(@PathVariable("id") Long id){
		SpuAttrValueEntity spuAttrValue = spuAttrValueService.getById(id);

        return R.ok().put("spuAttrValue", spuAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("product:spuattrvalue:save")
    public R save(@RequestBody SpuAttrValueEntity spuAttrValue){
		spuAttrValueService.save(spuAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
 //   @RequiresPermissions("product:spuattrvalue:update")
    public R update(@RequestBody SpuAttrValueEntity spuAttrValue){
		spuAttrValueService.updateById(spuAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("product:spuattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		spuAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
