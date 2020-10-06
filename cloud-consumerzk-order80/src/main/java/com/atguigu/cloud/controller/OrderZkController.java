/**
 * OrderZkController.java 2020年8月7日
 */
package com.atguigu.cloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>OrderZkController</b> is 服务消费者
 * </p> 访问：http://localhost/consumer/payment/zk
 *
 * @since 2020年8月7日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
public class OrderZkController {

	public static final String INVOKE_URL = "http://cloud-provider-payment";
	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/zk")
	public String paymentInfo() {
		return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
	}

}
