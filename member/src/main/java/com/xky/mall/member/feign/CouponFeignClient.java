package com.xky.mall.member.feign;


import com.xky.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeignClient {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupon();
}
