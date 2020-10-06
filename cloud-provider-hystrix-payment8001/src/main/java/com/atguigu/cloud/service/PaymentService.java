/**
 * PaymentService.java 2020年9月22日
 */
package com.atguigu.cloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import cn.hutool.core.util.IdUtil;

/**
 * <p>
 * <b>PaymentService</b> is
 * </p>
 *
 * @since 2020年9月22日
 * @author zengwk
 * @version $Id$
 */
@Service
public class PaymentService {

	public String paymentInfo_OK(Integer id) {
		return "线程池 " + Thread.currentThread().getName() + " paymentInfo,Id: " + id + "\t" + "O(∩_∩)O哈哈~" + "  耗时(秒): ";
	}

	/**
	 * @HystrixCommand 表示服务降级的注解
	 * fallbackMethod 服务降级之后执行的方法为：paymjentInfo_TimeOutHandler
	 * @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000") }) 表示这个线程的超时时间为3秒钟，3秒钟之后走服务降级方法
	 * @param id
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "paymjentInfo_TimeOutHandler", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000") })
	public String paymjentInfo_TimeOut(Integer id) {
		/*try {
			int timeNuber = 3;
			TimeUnit.SECONDS.sleep(timeNuber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//int age = 10 / 0;
		return "线程池 " + Thread.currentThread().getName() + "Id: " + id + "\t" + "O(∩_∩)O哈哈~";
	}

	//服务超时降级处理方法
	public String paymjentInfo_TimeOutHandler(Integer id) {
		return "线程池 " + Thread.currentThread().getName() + "Id: " + id + "\t 8001系统网络连接慢或者内部程序出错： " + "o(╥﹏╥)o";
	}

	//=====服务熔断
	@HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = { //当出现运行时错误就调用这个paymentCircuitBreaker_fallback 方法
			@HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 是否开启断路器
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), // 请求次数
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),// 失败率达到60%后跳闸
	})
	public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
		if (id < 0) {
			throw new RuntimeException("******id 不能为负数！");
		}
		String serialNumber = IdUtil.simpleUUID();

		return Thread.currentThread().getName() + "\t  调用成功！id: \t" + id + "\t 流水号：" + serialNumber;
	}

	public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id) {
		return "id: " + id + "  不能为负数，请稍后再试， o(TωT)o ";
	}

}
