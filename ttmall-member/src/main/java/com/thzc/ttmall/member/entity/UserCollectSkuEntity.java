package com.thzc.ttmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 关注商品表
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:03:58
 */
@Data
@TableName("ums_user_collect_sku")
public class UserCollectSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * sku标题
	 */
	private String skuTitle;
	/**
	 * sku默认图片
	 */
	private String skuImage;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
