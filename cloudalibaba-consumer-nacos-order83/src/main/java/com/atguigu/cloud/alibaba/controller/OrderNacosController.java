/**
 * OrderNacosController.java 2020年9月29日
 */
package com.atguigu.cloud.alibaba.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * <b>OrderNacosController</b> is
 * </p> http://localhost:83/consumer/payment/nacos/2
 *
 * @since 2020年9月29日
 * @author zengwk
 * @version $Id$
 */
@RestController
public class OrderNacosController {

	@Resource
	private RestTemplate restTemplate;

	@Value("${service-url.nacos-user-service}")
	private String serverURL;

	@GetMapping(value = "/consumer/payment/nacos/{id}")
	public String paymentInfo(@PathVariable("id") Long id) {
		return restTemplate.getForObject(serverURL + "/payment/nacos/" + id, String.class);
	}

}
