/**
 * OrderDao.java 2020年10月5日
 */
package com.atguigu.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.cloud.entity.Order;

/**
 * <p>
 * <b>OrderDao</b> is 
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Mapper
public interface OrderDao {

	//新建订单
	void create(Order order);

	//修改订单状态，从0改为1
	void update(@Param("userId") Long userId, @Param("status") Integer status);

}
