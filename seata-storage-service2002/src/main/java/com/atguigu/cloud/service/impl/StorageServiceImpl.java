/**
 * StorageServiceImpl.java 2020年10月5日
 */
package com.atguigu.cloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.cloud.dao.StorageDao;
import com.atguigu.cloud.service.StorageService;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>StorageServiceImpl</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

	@Resource
	private StorageDao storageDao;

	/* (non-Javadoc)
	 * @see com.atguigu.cloud.service.StorageService#decrease(java.lang.Long, java.lang.Integer)
	 */
	@Override
	public void decrease(Long productId, Integer count) {
		log.info("------->storage-service中扣减库存开始");
		storageDao.decrease(count, productId);
		log.info("------->storage-service中扣减库存結束");
	}

}
