/**
 * StorageService.java 2020年10月5日
 */
package com.atguigu.cloud.service;

/**
 * <p>
 * <b>StorageService</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
public interface StorageService {

	/**
	 * 扣减库存
	 */
	void decrease(Long productId, Integer count);

}
