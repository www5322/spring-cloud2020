/**
 * StorageService.java 2020年10月5日
 */
package com.atguigu.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.cloud.entities.CommonResult;

/**
 * <p>
 * <b>StorageService</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

	@PostMapping(value = "/storage/decrease")
	CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
