/**
 * OrderNacosMain84.java 2020年10月2日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 * <b>OrderNacosMain84</b> is
 * </p>
 *
 * @since 2020年10月2日
 * @author zengwk
 * @version $Id$
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderNacosMain84 {

	public static void main(String[] args) {
		SpringApplication.run(OrderNacosMain84.class, args);
	}

}
