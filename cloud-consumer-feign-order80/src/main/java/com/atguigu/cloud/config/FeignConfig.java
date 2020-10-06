/**
 * FeignConfig.java 2020年9月13日
 */
package com.atguigu.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

/**
 * <p>
 * <b>FeignConfig</b> is
 * </p>
 *
 * @since 2020年9月13日
 * @author zengwk
 * @version $Id$
 */
@Configuration
public class FeignConfig {

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
}

