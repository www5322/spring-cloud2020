/**
 * main3366.java 2020年9月27日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <b>main3366</b> is
 * </p>
 *
 * @since 2020年9月27日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {

	public static void main(String[] args) {

		SpringApplication.run(ConfigClientMain3366.class, args);

	}

}
