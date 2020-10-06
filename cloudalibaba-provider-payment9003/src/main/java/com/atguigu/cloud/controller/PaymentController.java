/**
 * PaymentController.java 2020年10月2日
 */
package com.atguigu.cloud.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;

/**
 * <p>
 * <b>PaymentController</b> is
 * </p>
 *
 * @since 2020年10月2日
 * @author zengwk
 * @version $Id$
 */
@RestController
public class PaymentController {

	@Value("server.port")
	private String serverPort;

	public static HashMap<Long, Payment> hashMap = null;

	static {
		hashMap = new HashMap<Long, Payment>();
		hashMap.put(1L, new Payment(1L, "28a8c1e3bc2742d8848569891fb42181"));
		hashMap.put(2L, new Payment(2L, "bba8c1e3bc2742d8848569891ac32182"));
		hashMap.put(3L, new Payment(3L, "6ua8c1e3bc2742d8848569891xt92183"));
	}

	@GetMapping(value = "/paymentSQL/{id}")
	public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
		Payment payment = hashMap.get(id);
		CommonResult<Payment> result = new CommonResult<Payment>(200, "from mysql,serverPort:  " + serverPort, payment);
		return result;
	}

}
