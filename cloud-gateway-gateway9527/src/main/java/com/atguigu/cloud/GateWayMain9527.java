/**
 * GateWayMain9527.java 2020年9月25日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <b>GateWayMain9527</b> is GateWay网关过滤
 * </p>
 *
 * @since 2020年9月25日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {

	public static void main(String[] args) {
		SpringApplication.run(GateWayMain9527.class, args);
	}

}
