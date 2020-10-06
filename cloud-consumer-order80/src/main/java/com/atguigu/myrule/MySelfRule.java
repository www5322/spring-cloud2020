/**
 * MySelfRule.java 2020年9月12日
 */
package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * <p>
 * <b>MySelfRule</b> is 定义轮询机制
 * </p>
 *
 * @since 2020年9月12日
 * @author zengwk
 * @version $Id$
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		return new RandomRule();
	}

}
