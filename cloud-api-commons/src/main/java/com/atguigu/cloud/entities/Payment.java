/**
 * Payment.java 2020年7月11日
 */
package com.atguigu.cloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <b>Payment</b> is
 * </p>
 *
 * @since 2020年7月11日
 * @author zengwk
 * @version $Id$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private String serial;

}
