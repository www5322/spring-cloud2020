/**
 * PaymentFeignService.java 2020年9月12日
 */
package com.atguigu.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;

/**
 * <p>
 * <b>PaymentFeignService</b> is
 * </p>
 *
 * @since 2020年9月12日
 * @author zengwk
 * @version $Id$
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

	@GetMapping("/payment/get/{id}")
	public CommonResult<Payment> get(@PathVariable("id") Long id);

	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout();

}
