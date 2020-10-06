/**
 * PaymentFallbackService.java 2020年9月22日
 */
package com.atguigu.cloud.service.fallback;

import org.springframework.stereotype.Component;

import com.atguigu.cloud.service.PaymentHystrixService;

/**
 * <p>
 * <b>PaymentFallbackService</b> is 处理服务降级的方法，一般用于服务提供端宕机后无法访问是给出的提示
 * </p>
 *
 * @since 2020年9月22日
 * @author zengwk
 * @version $Id$
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

	/* (non-Javadoc)
	 * @see com.atguigu.cloud.service.PaymentHystrixService#paymentInfo_OK(java.lang.Integer)
	 */
	@Override
	public String paymentInfo_OK(Integer id) {
		return "8001服务提供端宕机-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
	}

	/* (non-Javadoc)
	 * @see com.atguigu.cloud.service.PaymentHystrixService#paymentInfo_Timeout(java.lang.Integer)
	 */
	@Override
	public String paymentInfo_Timeout(Integer id) {
		return "8001服务提供端宕机-----PaymentFallbackService fall back-paymentInfo_Timeout ,o(╥﹏╥)o";
	}

}
