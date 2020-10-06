/**
 * CommonResult.java 2020年7月9日
 */
package com.atguigu.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <b>CommonResult</b> is
 * </p>
 *
 * @since 2020年7月9日
 * @author zengwk
 * @version $Id$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

	private Integer code;

	private String message;

	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}

	

}
