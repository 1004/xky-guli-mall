package com.xky.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xky.common.utils.PageUtils;
import com.xky.mall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:07:20
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

