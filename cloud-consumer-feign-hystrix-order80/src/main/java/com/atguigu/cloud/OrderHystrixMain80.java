/**
 * OrderHystrixMain80.java 2020年9月22日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 * <b>OrderHystrixMain80</b> is
 * </p>
 *
 * @since 2020年9月22日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {

	public static void main(String[] args) {

		SpringApplication.run(OrderHystrixMain80.class, args);

	}

}
