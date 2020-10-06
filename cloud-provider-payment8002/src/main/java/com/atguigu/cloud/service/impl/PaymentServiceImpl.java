/**
 * PaymentServiceImpl.java 2020年7月9日
 */
package com.atguigu.cloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.cloud.dao.PaymentDao;
import com.atguigu.cloud.entities.Payment;
import com.atguigu.cloud.service.PaymentService;

/**
 * <p>
 * <b>PaymentServiceImpl</b> is
 * </p>
 *
 * @since 2020年7月9日
 * @author zengwk
 * @version $Id$
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Resource
	private PaymentDao paymentDao;

	/* (non-Javadoc)
	 * @see com.atguigu.cloud.service.PaymentService#create(com.atguigu.cloud.entities.Payment)
	 */
	@Override
	public int create(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.create(payment);
	}

	/* (non-Javadoc)
	 * @see com.atguigu.cloud.service.PaymentService#getPaymentById(java.lang.Long)
	 */
	@Override
	public Payment getPaymentById(Long id) {
		// TODO Auto-generated method stub
		return paymentDao.getPaymentById(id);
	}

}
