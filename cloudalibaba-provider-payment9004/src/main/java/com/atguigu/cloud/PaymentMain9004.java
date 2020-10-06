/**
 * PaymentMain9004.java 2020年10月2日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <b>PaymentMain9004</b> is
 * </p>
 *
 * @since 2020年10月2日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {


	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9004.class, args);

	}

}
