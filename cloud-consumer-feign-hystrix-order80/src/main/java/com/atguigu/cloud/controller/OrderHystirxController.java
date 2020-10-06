/**
 * OrderHystirxController.java 2020年9月22日
 */
package com.atguigu.cloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>OrderHystirxController</b> is
 * </p>
 * 
 *  @DefaultProperties(defaultFallback = "fallback_Global_Method") ：表示如果没有配置服务降级的方法就使用默认觉得，前提是方法上需要配置注解@HystrixCommand
 *
 * @since 2020年9月22日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "fallback_Global_Method")
public class OrderHystirxController {

	@Resource
	private PaymentHystrixService hystrixService;

	@GetMapping("/consumer/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = hystrixService.paymentInfo_OK(id);
		return result;
	}

	/**
	 * @HystrixCommand 表示服务降级的注解，一般用于运行时异常和访问超时异常
	 * fallbackMethod 服务降级之后执行的方法为：paymjentInfo_TimeOutHandler
	 * @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500") }) 表示这个线程的超时时间为1.5秒钟，1.5秒钟之后走服务降级方法
	 * paymentInfoTimeoutFallbackMethod 自定义的服务降级处理方法
	 * @param id
	 * @return
	 */
	@GetMapping("/consumer/payment/hystrix/timeout/{id}")
	@HystrixCommand(fallbackMethod = "paymentInfoTimeoutFallbackMethod", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000") })
	public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
		/*try {
			int timeNuber = 3;
			TimeUnit.SECONDS.sleep(timeNuber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		String result = hystrixService.paymentInfo_Timeout(id);
		return result;
	}

	@GetMapping("/consumer/payment/hystrix/timeoutTwo/{id}")
	@HystrixCommand //没有配置属性表示引用全局
	public String paymentInfo_Timeout2(@PathVariable("id") Integer id) {
		String result = hystrixService.paymentInfo_Timeout(id);
		return result;
	}

	public String paymentInfoTimeoutFallbackMethod(Integer id) {
		return "我是固定消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
	}
	
	public String fallback_Global_Method() {
		return "Global处理异常，请稍后再试：〒▽〒";
	}

}
