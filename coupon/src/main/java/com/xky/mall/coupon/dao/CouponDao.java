package com.xky.mall.coupon.dao;

import com.xky.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:02:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
