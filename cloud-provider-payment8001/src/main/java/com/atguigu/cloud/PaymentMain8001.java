/**
 * PaymentMain8001.java 2020年7月9日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <b>PaymentMain8001</b> is
 * </p>
 *
 * @since 2020年7月9日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8001 {

	public static void main(String[] args) {

		SpringApplication.run(PaymentMain8001.class, args);

	}

}
