/**
 * ApplicationContextConfig.java 2020年8月7日
 */
package com.atguigu.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * <b>ApplicationContextConfig</b> is
 * </p>
 *
 * @since 2020年8月7日
 * @author zengwk
 * @version $Id$
 */
@Configuration
public class ApplicationContextConfig {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
