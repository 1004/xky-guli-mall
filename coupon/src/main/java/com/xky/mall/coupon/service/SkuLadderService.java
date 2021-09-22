package com.xky.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xky.common.utils.PageUtils;
import com.xky.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:02:43
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

