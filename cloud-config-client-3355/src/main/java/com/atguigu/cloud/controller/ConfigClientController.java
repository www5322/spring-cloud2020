/**
 * ConfigClientController.java 2020年9月25日
 */
package com.atguigu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <b>ConfigClientController</b> is
 * </p>
 *
 * @since 2020年9月25日
 * @author zengwk
 * @version $Id$
 */
@RestController
@RefreshScope //用于监控实时刷新请求
public class ConfigClientController {

	@Value("${config.info}")
	private String configInfo;

	@GetMapping("/configInfo")
	public String getConfigInfo() {
		return configInfo;
	}

}
