/**
 * BlockHandler.java 2020年10月3日
 */
package com.atguigu.cloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.cloud.entities.CommonResult;

/**
 * <p>
 * <b>BlockHandler</b> is
 * </p>
 *
 * @since 2020年10月3日
 * @author zengwk
 * @version $Id$
 */
public class CustomerBlockHandler {

	public static CommonResult handlerException(BlockException exception) {
		return new CommonResult(4004, "按客戶自定义,处理异常：global handlerException----01");
	}

	public static CommonResult handlerException2(BlockException exception) {
		return new CommonResult(4005, "按客戶自定义,处理异常：global handlerException----02");
	}

}
