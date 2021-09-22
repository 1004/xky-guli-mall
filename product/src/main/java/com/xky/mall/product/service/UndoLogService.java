package com.xky.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xky.common.utils.PageUtils;
import com.xky.mall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xky
 * @email xky@gmail.com
 * @date 2021-09-17 20:06:03
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

