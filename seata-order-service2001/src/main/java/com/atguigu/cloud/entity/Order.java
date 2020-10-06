/**
 * Order.java 2020年10月5日
 */
package com.atguigu.cloud.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <b>Order</b> is 订单表
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	private Long id;
	private Long userId;// 用户id
	private Long productId;// 产品id
	private Integer count; // 数量
	private BigDecimal money; // 金额
	private Integer status; // 订单状态: 0:创建中 1:已完结
}
