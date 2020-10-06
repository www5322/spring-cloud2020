/**
 * OrderFeignController.java 2020年9月12日
 */
package com.atguigu.cloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;
import com.atguigu.cloud.service.PaymentFeignService;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>OrderFeignController</b> is
 * </p>
 *
 * @since 2020年9月12日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
public class OrderFeignController {


	@Resource
	private PaymentFeignService paymentFeignService;

	@GetMapping(value = "/consumer/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		CommonResult<Payment> result = paymentFeignService.get(id);
		System.out.println(result);
		return result;
	}

	@GetMapping(value = "/consumer/payment/feign/timeout")
	public String paymentFeignTimeout() {
		return paymentFeignService.paymentFeignTimeout();
	}

}
