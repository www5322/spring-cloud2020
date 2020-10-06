/**
 * AccountServiceImpl.java 2020年10月5日
 */
package com.atguigu.cloud.service.impl;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.cloud.dao.AccountDao;
import com.atguigu.cloud.service.AccountService;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>AccountServiceImpl</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

	@Resource
	private AccountDao accountDao;

	@Override
	public void decrease(Long userId, BigDecimal money) {

		log.info("------->account-service中扣减账户余额开始");
		//模拟超时异常，全局事务回滚
		//暂停几秒钟线程
		/*try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		accountDao.decrease(userId, money);
		log.info("------->account-service中扣减账户余额结束");


	}

}
