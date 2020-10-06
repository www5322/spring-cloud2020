/**
 * PaymentMain8004.java 2020年8月7日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <b>PaymentMain8004</b> is 服务提供者
 * </p>
 *
 * @since 2020年8月7日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8004.class, args);

	}

}
