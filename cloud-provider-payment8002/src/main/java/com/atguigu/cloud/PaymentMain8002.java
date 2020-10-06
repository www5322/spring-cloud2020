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
@EnableEurekaClient // 表示用于Eureka的客户端注解
@EnableDiscoveryClient // 用于服务发现
public class PaymentMain8002 {

	public static void main(String[] args) {

		SpringApplication.run(PaymentMain8002.class, args);

	}

}
