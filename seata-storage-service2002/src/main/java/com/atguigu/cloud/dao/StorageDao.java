/**
 * StorageDao.java 2020年10月5日
 */
package com.atguigu.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * <b>StorageDao</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Mapper
public interface StorageDao {

	//扣减库存
	void decrease(@Param("count") int count, @Param("productId") Long productId);

}
