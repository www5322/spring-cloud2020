/**
 * MainApp8401.java 2020年10月1日
 */
package com.atguigu.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <b>MainApp8401</b> is
 * </p>
 *
 * @since 2020年10月1日
 * @author zengwk
 * @version $Id$
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401 {

	public static void main(String[] args) {

		SpringApplication.run(MainApp8401.class, args);

	}

}
