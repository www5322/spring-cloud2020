/**
 * AccountService.java 2020年10月5日
 */
package com.atguigu.cloud.service;

import java.math.BigDecimal;

/**
 * <p>
 * <b>AccountService</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
public interface AccountService {

	void decrease(Long userId, BigDecimal money);

}
