/**
 * CircleBreakerController.java 2020年10月2日
 */
package com.atguigu.cloud.Controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;
import com.atguigu.cloud.handler.CustomerBlockHandler;
import com.atguigu.cloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>CircleBreakerController</b> is
 * </p>
 *
 * @since 2020年10月2日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
public class CircleBreakerController {

	//==================这里使用RestTemplate技术来整的===================================
	private static final String SERVICE_URL = "http://nacos-payment-provider";
	
	@Resource
	private RestTemplate restTemplate;
	
	@RequestMapping("/consumer/fallback/{id}")
	//@SentinelResource(value = "fallback")//无配置直接报错
	//@SentinelResource(value = "fallback", fallback = "handlerFallback") //fallback 处理程序的业务异常
	//fallback 处理程序的业务异常;blockHandler只负责sentinel控制台配置违规;exceptionsToIgnore 排除固定的异常，就是配置了的异常不走兜底方法
	/*@SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler", exceptionsToIgnore = {
			IllegalArgumentException.class })*/
	@SentinelResource(value = "fallback", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
	public CommonResult<Payment> fallback(@PathVariable("id") Long id) {
		CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, CommonResult.class, id);
		if (id == 4) {
			throw new IllegalArgumentException("IllegalArgumentException,非法参数异常....");
		}
		if (result.getData() == null) {
			throw new NullPointerException("NullPointerException,该ID没有对应记录,空指针异常");
		}
		return result;
	}
	
	/**
		* 本例是fallback
		* @param id
		* @param Throwable 可以将原路径方法的异常信息给带过来
		* @return
		*/
		public CommonResult<Payment> handlerFallback(@PathVariable Long id, Throwable e) {
		Payment payment = new Payment(id, "null");
		return new CommonResult<>(444, "兜底异常handlerFallback,exception内容  " + e.getMessage(), payment);
		}
		
		//本例是blockHandler
		public CommonResult blockHandler(@PathVariable Long id, BlockException blockException) {
		Payment payment = new Payment(id, "null");
		return new CommonResult<>(445, "blockHandler-sentinel限流,无此流水: blockException  " + blockException.getMessage(), payment);
	}


	//==================这里使用OpenFeign技术来整的===================================
	@Resource
	private PaymentService paymentService;

	/**
	 * blockHandlerClass = CustomerBlockHandler.class :引用这个异常类来处理降级规则的异常
	 * blockHandler = "handlerException2" : 这个CustomerBlockHandler类下的handlerException2方法
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/consumer/paymentSQL/{id}")
	//@SentinelResource(value = "paymentSQL", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
	@SentinelResource(value = "paymentSQL", blockHandler = "blockHandler")
	public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
		return paymentService.paymentSQL(id);
	}


}
