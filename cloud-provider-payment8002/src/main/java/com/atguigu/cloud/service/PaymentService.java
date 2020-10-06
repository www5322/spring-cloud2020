/**
 * PaymentService.java 2020年7月9日
 */
package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Payment;

/**
 * <p>
 * <b>PaymentService</b> is
 * </p>
 *
 * @since 2020年7月9日
 * @author zengwk
 * @version $Id$
 */
public interface PaymentService {

	public int create(Payment payment);

	public Payment getPaymentById(Long id);

}
