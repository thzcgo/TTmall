package com.thzc.ttmall.ware.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thzc.ttmall.ware.entity.WareOrderBillDetailEntity;
import com.thzc.ttmall.ware.service.WareOrderBillDetailService;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.R;



/**
 * 库存工作单
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:17:22
 */
@RestController
@RequestMapping("ware/wareorderbilldetail")
public class WareOrderBillDetailController {
    @Autowired
    private WareOrderBillDetailService wareOrderBillDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("ware:wareorderbilldetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareOrderBillDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("ware:wareorderbilldetail:info")
    public R info(@PathVariable("id") Long id){
		WareOrderBillDetailEntity wareOrderBillDetail = wareOrderBillDetailService.getById(id);

        return R.ok().put("wareOrderBillDetail", wareOrderBillDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("ware:wareorderbilldetail:save")
    public R save(@RequestBody WareOrderBillDetailEntity wareOrderBillDetail){
		wareOrderBillDetailService.save(wareOrderBillDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
 //   @RequiresPermissions("ware:wareorderbilldetail:update")
    public R update(@RequestBody WareOrderBillDetailEntity wareOrderBillDetail){
		wareOrderBillDetailService.updateById(wareOrderBillDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("ware:wareorderbilldetail:delete")
    public R delete(@RequestBody Long[] ids){
		wareOrderBillDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
