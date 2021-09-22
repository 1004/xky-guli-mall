package com.xky.mall.member.dao;

import com.xky.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:07:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
