/**
 * PaymentDao.java 2020年7月9日
 */
package com.atguigu.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.cloud.entities.Payment;

/**
 * <p>
 * <b>PaymentDao</b> is
 * </p>
 *
 * @since 2020年7月9日
 * @author zengwk
 * @version $Id$
 */
@Mapper
public interface PaymentDao {

	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);

}
