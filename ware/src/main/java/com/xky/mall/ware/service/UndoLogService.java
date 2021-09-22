package com.xky.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xky.common.utils.PageUtils;
import com.xky.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-18 11:13:11
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

