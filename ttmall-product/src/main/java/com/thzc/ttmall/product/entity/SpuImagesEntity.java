package com.thzc.ttmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuͼƬ
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:42
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	@TableId
	private Long id;

	private Long spuId;

	private String imgName;

	private String imgUrl;

	private Integer imgSort;

	private Integer defaultImg;

}
