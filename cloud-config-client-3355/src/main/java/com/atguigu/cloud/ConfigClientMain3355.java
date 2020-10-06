/**
 * ConfigClientMain3355.java 2020年9月25日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <b>ConfigClientMain3355</b> is
 * </p>
 *
 * @since 2020年9月25日
 * @author zengwk
 * @version $Id$
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientMain3355.class, args);

	}

}
