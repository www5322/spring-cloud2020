/**
 * PaymentController.java 2020年7月9日
 */
package com.atguigu.cloud.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;
import com.atguigu.cloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>PaymentController</b> is
 * </p>
 * 访问：http://localhost:8002/payment/get/2
 * http://localhost/consumer/get/2
 * @since 2020年7月9日
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

	@Autowired
	private DiscoveryClient discoveryClient;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(value = "/payment/create")
	public CommonResult create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		System.out.println("******插入结果：" + result);
		log.info("******插入---结果：" + result);
		if (result > 0) {
			return new CommonResult(200, "插入数据库成功！端口号为：" + serverPort, result);
		} else {
			return new CommonResult(400, "插入数据库失败！", null);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		Payment result = paymentService.getPaymentById(id);
		String jsonString = JSONObject.toJSONString(result);
		System.out.println("******查询---结果：" + jsonString);
		if (result != null) {
			return new CommonResult(200, "查询--成功！端口号为：" + serverPort, result);
		} else {
			return new CommonResult(400, "查询--失败！ID:" + id, null);
		}
	}

	@GetMapping(value = "/payment/discovery")
	public Object discovery() {
		List<String> list = discoveryClient.getServices();
		for (String element : list) {
			log.info("***********element:" + element);
		}

		List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
		for (ServiceInstance instance : instances) {
			log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
		}
		return this.discoveryClient;
	}

	@GetMapping(value = "/payment/lb")
	public String getPaymentLB() {
		System.out.println("来到了" + serverPort + "端口");
		return serverPort;
	}

	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout() {
		// 业务逻辑处理正确，但是需要耗费3秒钟
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return serverPort;
	}

}
