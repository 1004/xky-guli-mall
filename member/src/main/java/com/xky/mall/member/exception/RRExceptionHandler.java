/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.xky.mall.member.exception;

import com.xky.common.exception.BizCodeEnum;
import com.xky.common.exception.RRException;
import com.xky.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理器
 *
 * @author Mark sunlightcs@gmail.com
 */
@Slf4j
@RestControllerAdvice(annotations = {RestController.class})
public class RRExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(RRException.class)
	public R handleRRException(RRException e){
		R r = new R();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());

		return r;
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public R handlerNoFoundException(Exception e) {
		logger.error(e.getMessage(), e);
		return R.error(404, "路径不存在，请检查路径是否正确");
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public R handleDuplicateKeyException(DuplicateKeyException e){
		logger.error(e.getMessage(), e);
		return R.error("数据库中已存在该记录");
	}

	@ExceptionHandler(Exception.class)
	public R handleException(Exception e){
		logger.error(e.getMessage(), e);
		return R.error();
	}

	@ExceptionHandler(value= MethodArgumentNotValidException.class)
	public R handleValidException(MethodArgumentNotValidException e){
		log.error("数据校验出现问题{}，异常类型：{}",e.getMessage(),e.getClass());
		BindingResult bindingResult = e.getBindingResult();

		Map<String,String> errorMap = new HashMap<>();
		bindingResult.getFieldErrors().forEach((fieldError)->{
			errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
		});
		return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(),BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data",errorMap);
	}



}
