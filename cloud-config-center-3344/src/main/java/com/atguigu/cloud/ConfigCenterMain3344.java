/**
 * ConfigCenterMain3344.java 2020年9月25日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <p>
 * <b>ConfigCenterMain3344</b> is
 * </p>
 *
 * @since 2020年9月25日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {

	public static void main(String[] args) {

		SpringApplication.run(ConfigCenterMain3344.class, args);

	}

}
