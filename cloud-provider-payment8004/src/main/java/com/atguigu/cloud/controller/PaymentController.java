/**
 * PaymentController.java 2020年8月7日
 */
package com.atguigu.cloud.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>PaymentController</b> is 服务提供者
 * </p> 访问：http://localhost:8004/payment/zk
 *
 * @since 2020年8月7日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@RequestMapping(value = "payment/zk")
	public String paymentZk() {
		return "SpringCloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID().toString();
	}

}
