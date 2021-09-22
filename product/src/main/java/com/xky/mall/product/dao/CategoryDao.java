package com.xky.mall.product.dao;

import com.xky.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-17 20:06:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
