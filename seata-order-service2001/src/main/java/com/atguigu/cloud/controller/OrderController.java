/**
 * OrderController.java 2020年10月5日
 */
package com.atguigu.cloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entity.Order;
import com.atguigu.cloud.service.OrderService;

/**
 * <p>
 * <b>OrderController</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@RestController
public class OrderController {

	@Resource
	private OrderService orderSevice;

	@GetMapping("/order/create")
	public CommonResult create(Order order) {
		orderSevice.create(order);
		return new CommonResult(200, "订单新建成功");
	}

}
