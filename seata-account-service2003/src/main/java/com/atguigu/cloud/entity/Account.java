/**
 * Account.java 2020年10月5日
 */
package com.atguigu.cloud.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <b>Account</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	private Long id;
	private Long userId;
	private BigDecimal total;
	private BigDecimal used;
	private BigDecimal residue;

}
