package com.thzc.ttmall.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thzc.ttmall.member.entity.UserStatisticsEntity;
import com.thzc.ttmall.member.service.UserStatisticsService;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.R;



/**
 * 统计信息表
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:03:59
 */
@RestController
@RequestMapping("member/userstatistics")
public class UserStatisticsController {
    @Autowired
    private UserStatisticsService userStatisticsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("member:userstatistics:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userStatisticsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("member:userstatistics:info")
    public R info(@PathVariable("id") Long id){
		UserStatisticsEntity userStatistics = userStatisticsService.getById(id);

        return R.ok().put("userStatistics", userStatistics);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("member:userstatistics:save")
    public R save(@RequestBody UserStatisticsEntity userStatistics){
		userStatisticsService.save(userStatistics);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
 //   @RequiresPermissions("member:userstatistics:update")
    public R update(@RequestBody UserStatisticsEntity userStatistics){
		userStatisticsService.updateById(userStatistics);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("member:userstatistics:delete")
    public R delete(@RequestBody Long[] ids){
		userStatisticsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}