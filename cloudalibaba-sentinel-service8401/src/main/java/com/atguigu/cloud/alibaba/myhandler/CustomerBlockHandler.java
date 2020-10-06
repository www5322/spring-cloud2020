/**
 * CustomerBlockHandler.java 2020年10月2日
 */
package com.atguigu.cloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.cloud.entities.CommonResult;

/**
 * <p>
 * <b>CustomerBlockHandler</b> is
 * </p>
 *
 * @since 2020年10月2日
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
