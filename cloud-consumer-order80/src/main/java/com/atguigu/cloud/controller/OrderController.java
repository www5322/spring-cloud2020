/**
 * OrderController.java 2020年7月11日
 */
package com.atguigu.cloud.controller;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;
import com.atguigu.cloud.lb.LoadBalancer;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>OrderController</b> is
 * </p>
 * 访问：http://localhost/consumer/get/2
 * @since 2020年7月11日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
public class OrderController {

	//public static final String PAYMENT_URL = "http://localhost:8001";
	public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

	@Resource
	private RestTemplate restTemplate;

	@Resource
	private LoadBalancer loadBalancer;

	@Resource
	private DiscoveryClient discoveryClient;

	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/create")
	public CommonResult<Payment> create(Payment payment) {
		System.out.println("---------------------打印测试---------------------");
		return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/get/{id}")
	public CommonResult<Payment> get(@PathVariable("id") Long id) {
		System.out.println("---------------------打印测试---------------------");
		return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/consumer/getForEntity/{id}")
	public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
		ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
		if (entity.getStatusCode().is2xxSuccessful()) {
			return entity.getBody();
		} else {
			return new CommonResult<>(400, "操作失败！");
		}
	}

	//检查轮询机制访问端口号
	@GetMapping(value = "/consumer/payment/lb")
	public String getPaymentLB() {
		List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
		if (instances == null || instances.size() <= 0) {
			return null;
		}

		ServiceInstance serviceInstance = loadBalancer.instances(instances);
		URI uri = serviceInstance.getUri();

		return restTemplate.getForObject(uri + "/payment/lb", String.class);
	}

}
