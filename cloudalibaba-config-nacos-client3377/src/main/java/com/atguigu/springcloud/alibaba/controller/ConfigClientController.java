/**
 * ConfigClientController.java 2020年9月29日
 */
package com.atguigu.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <b>ConfigClientController</b> is
 * </p>
 *
 * @since 2020年9月29日
 * @author zengwk
 * @version $Id$
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController {

	@Value("${config.info}")
	private String configInfo;

	@GetMapping("/config/info")
	public String getConfigInfo() {
		return configInfo;
	}

}
