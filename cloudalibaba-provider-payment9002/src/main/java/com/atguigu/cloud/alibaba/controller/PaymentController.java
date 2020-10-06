/**
 * PaymentController.java 2020年9月29日
 */
package com.atguigu.cloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <b>PaymentController</b> is
 * </p>
 *
 * @since 2020年9月29日
 * @author zengwk
 * @version $Id$
 */
@RestController
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/nacos/{id}")
	public String getPayment(@PathVariable("id") Integer id) {
		return "nacos 注册，serverPort:" + serverPort + "\t id: " + id;
	}

}
