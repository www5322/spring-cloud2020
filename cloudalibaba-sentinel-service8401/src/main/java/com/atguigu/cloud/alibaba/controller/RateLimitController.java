/**
 * RateLimitController.java 2020年10月2日
 */
package com.atguigu.cloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.cloud.alibaba.myhandler.CustomerBlockHandler;
import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>RateLimitController</b> is
 * </p>
 *
 * @since 2020年10月2日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
public class RateLimitController {

	@GetMapping("/byResource")
	@SentinelResource(value = "byResource", blockHandler = "handleException")
	public CommonResult byResource() {
		return new CommonResult(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
	}

	public CommonResult handleException(BlockException exception) {
		return new CommonResult(400, exception.getClass().getCanonicalName() + "\t 服务不可用");
	}

	@GetMapping("/rateLimit/customerBlockHander")
	@SentinelResource(value = "customerBlockHander", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
	public CommonResult customerBlockHander() {
		return new CommonResult(200, "按客户自定义", new Payment(2020L, "serial003"));
	}


}
