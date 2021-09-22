package com.xky.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xky.common.utils.PageUtils;
import com.xky.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:02:44
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

