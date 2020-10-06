/**
 * AccountDao.java 2020年10月5日
 */
package com.atguigu.cloud.dao;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * <b>AccountDao</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Mapper
public interface AccountDao {

	// 减除账户余额
	void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
