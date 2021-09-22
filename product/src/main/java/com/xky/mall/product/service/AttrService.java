package com.xky.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xky.common.utils.PageUtils;
import com.xky.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-17 20:06:04
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

