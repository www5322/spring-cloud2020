/**
 * AccountService.java 2020年10月5日
 */
package com.atguigu.cloud.service;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.cloud.entities.CommonResult;

/**
 * <p>
 * <b>AccountService</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

	//用户账户删减操作
	@PostMapping(value = "/account/decrease")
	CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
