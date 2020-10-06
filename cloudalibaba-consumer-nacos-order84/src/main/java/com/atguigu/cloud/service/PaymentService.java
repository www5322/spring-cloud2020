/**
 * PaymentService.java 2020年10月2日
 */
package com.atguigu.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;
import com.atguigu.cloud.service.fallback.PaymentFallbackService;

/**
 * <p>
 * <b>PaymentService</b> is
 * </p>
 *
 * @since 2020年10月2日
 * @author zengwk
 * @version $Id$
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

	@GetMapping(value = "/paymentSQL/{id}")
	public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);


}
