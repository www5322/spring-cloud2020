/**
 * OrderZKMain80.java 2020年8月7日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <b>OrderZKMain80</b> is 服务消费者
 * </p>访问：http://localhost/consumer/payment/zk
 *
 * @since 2020年8月7日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于使用consul或者zookeeper作为注册中心时注册服务
public class OrderZKMain80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(OrderZKMain80.class, args);

	}

}
