/**
 * AccountController.java 2020年10月5日
 */
package com.atguigu.cloud.controller;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.service.AccountService;

/**
 * <p>
 * <b>AccountController</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@RestController
public class AccountController {

	@Resource
	private AccountService accountService;


	/**
	* 扣减账户余额
	*/
	@RequestMapping("/account/decrease")
	public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
		accountService.decrease(userId, money);
		return new CommonResult(200, "扣减账户余额成功！");
	}

}
