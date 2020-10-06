/**
 * MyBatisConfig.java 2020年10月5日
 */
package com.atguigu.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * <b>MyBatisConfig</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Configuration
@MapperScan({ "com.atguigu.cloud.dao" })
public class MyBatisConfig {

}
