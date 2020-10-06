/**
 * PaymentMain9001.java 2020年9月29日
 */
package com.atguigu.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <b>PaymentMain9001</b> is 启动类
 * </p>
 *
 * @since 2020年9月29日
 * @author zengwk
 * @version $Id$
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9001 {

	public static void main(String[] args) {

		SpringApplication.run(PaymentMain9001.class, args);

	}

}
