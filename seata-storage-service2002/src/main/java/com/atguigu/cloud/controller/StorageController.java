/**
 * StorageController.java 2020年10月5日
 */
package com.atguigu.cloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.service.StorageService;

/**
 * <p>
 * <b>StorageController</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@RestController
public class StorageController {

	@Resource
	private StorageService storageService;

	@RequestMapping("/storage/decrease")
	public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
		storageService.decrease(productId, count);
		return new CommonResult(200, "扣减库存成功！");
	}

}
