/**
 * PaymentFallbackService.java 2020年10月2日
 */
package com.atguigu.cloud.service.fallback;

import org.springframework.stereotype.Component;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;
import com.atguigu.cloud.service.PaymentService;

/**
 * <p>
 * <b>PaymentFallbackService</b> is
 * </p>
 *
 * @since 2020年10月2日
 * @author zengwk
 * @version $Id$
 */
@Component
public class PaymentFallbackService implements PaymentService {

	@Override
	public CommonResult<Payment> paymentSQL(Long id) {
		return new CommonResult<>(4004, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
	}

}
