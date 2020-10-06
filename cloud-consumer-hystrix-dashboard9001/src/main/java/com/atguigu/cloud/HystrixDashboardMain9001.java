/**
 * HystrixDashboardMain9001.java 2020年9月24日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>
 * <b>HystrixDashboardMain9001</b> is
 * </p>
 *
 * @since 2020年9月24日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardMain9001.class, args);

	}

}
