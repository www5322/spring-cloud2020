/**
 * EurekaMain7001.java 2020年7月13日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * <b>EurekaMain7001</b> is
 * </p>
 * 访问路径： http://eureka7001.com:7001
 * @since 2020年7月13日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableEurekaServer // 表示用于Eureka的服务端注解
public class EurekaMain7001 {

	public static void main(String[] args) {

		SpringApplication.run(EurekaMain7001.class, args);

	}

}
