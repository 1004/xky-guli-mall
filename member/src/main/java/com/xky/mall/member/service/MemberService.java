package com.xky.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xky.common.utils.PageUtils;
import com.xky.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:07:21
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

