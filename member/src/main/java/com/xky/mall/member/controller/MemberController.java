package com.xky.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.xky.common.exception.RRException;
import com.xky.mall.member.feign.CouponFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xky.mall.member.entity.MemberEntity;
import com.xky.mall.member.service.MemberService;
import com.xky.common.utils.PageUtils;
import com.xky.common.utils.R;



/**
 * 会员
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:07:21
 */
@RefreshScope
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignClient couponFeignClient;

    @Value("${member.user.name}")
    private String userName;

    @RequestMapping("/testConfig")
    public R testConfig(){
        throw new RRException("错误");
//        return R.ok().put("name",userName);
    }

    @RequestMapping("/coupon/list")
    public R memBerCoupon(){
        MemberEntity entity = new MemberEntity();
        entity.setNickname("张三");
        R coupons = couponFeignClient.memberCoupon();
        return R.ok().put("member",entity).put("coupons",coupons.get("coupon"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
