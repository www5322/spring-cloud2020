/**
 * PaymentMain9003.java 2020年10月2日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <b>PaymentMain9003</b> is 启动类
 * </p>
 *
 * @since 2020年10月2日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(PaymentMain9003.class, args);

	}

}
