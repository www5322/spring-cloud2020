/**
 * OrderNacosMain83.java 2020年9月29日
 */
package com.atguigu.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <b>OrderNacosMain83</b> is
 * </p>
 *
 * @since 2020年9月29日
 * @author zengwk
 * @version $Id$
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83 {

	public static void main(String[] args) {

		SpringApplication.run(OrderNacosMain83.class, args);

	}

}
