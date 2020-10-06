/**
 * OrderFeignMain80.java 2020年9月12日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 * <b>OrderFeignMain80</b> is
 * </p>
 *
 * @since 2020年9月12日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderFeignMain80 {

	public static void main(String[] args) {

		SpringApplication.run(OrderFeignMain80.class, args);

	}

}
