package com.atguigu.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.atguigu.cloud.service.fallback.PaymentFallbackService;

/**
 * @FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackService.class)
 * fallback = PaymentFallbackService.class 直接在实现类处理服务降级的逻辑
 * value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT" 注册的服务名
 * @since 2020年9月22日
 * @author zengwk 
 * @version $Id$
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

	@GetMapping("/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id);

	@GetMapping("/payment/hystrix/timeout/{id}")
	public String paymentInfo_Timeout(@PathVariable("id") Integer id);
}
