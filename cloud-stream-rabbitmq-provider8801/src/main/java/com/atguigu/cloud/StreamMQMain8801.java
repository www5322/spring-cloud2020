/**
 * StreamMQMain8801.java 2020年9月27日
 */
package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * <b>StreamMQMain8801</b> is 消息生产
 * </p> http://localhost:8801/sendMessage
 *
 * @since 2020年9月27日
 * @author zengwk
 * @version $Id$
 */
@SpringBootApplication
public class StreamMQMain8801 {

	public static void main(String[] args) {

		SpringApplication.run(StreamMQMain8801.class, args);

	}

}
