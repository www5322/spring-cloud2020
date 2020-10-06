/**
 * OrderMain80.java 2020年7月11日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <b>OrderMain80</b> is
 * </p>
 *
 * @since 2020年7月11日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {

	public static void main(String[] args) {
		SpringApplication.run(OrderMain80.class, args);
	}

}
