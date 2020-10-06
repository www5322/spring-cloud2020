/**
 * NacosConfigClientMain3377.java 2020年9月29日
 */
package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <b>NacosConfigClientMain3377</b> is
 * </p>
 *
 * @since 2020年9月29日
 * @author zengwk
 * @version $Id$
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NacosConfigClientMain3377.class, args);

	}

}
