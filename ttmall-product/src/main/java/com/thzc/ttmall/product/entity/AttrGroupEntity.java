package com.thzc.ttmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:42
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * 
	 */
	private String attrGroupName;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 
	 */
	private String descript;
	/**
	 * 
	 */
	private String icon;
	/**
	 * 
	 */
	private Long catelogId;

	/**
	 *所属的三级分类路径
	 */
	@TableField(exist = false)
	private Long[] catelogPath;

}
