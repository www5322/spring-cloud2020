/**
 * PaymentController.java 2020年9月22日
 */
package com.atguigu.cloud.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>PaymentController</b> is
 * </p>
 *   localhost:8001/payment/hystrix/ok/2
 *   http://localhost:8001/payment/hystrix/timeout/2
 * @since 2020年9月22日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@GetMapping("/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentService.paymentInfo_OK(id);
		log.info("****result: " + result);
		return result;
	}

	@GetMapping("/payment/hystrix/timeout/{id}")
	public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
		String result = paymentService.paymjentInfo_TimeOut(id);
		log.info("****result: " + result);
		return result;
	}

	//====服务熔断
	@GetMapping("/payment/circuit/{id}")
	public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
		String result = paymentService.paymentCircuitBreaker(id);
		log.info("****result: " + result);
		return result;
	}

}
