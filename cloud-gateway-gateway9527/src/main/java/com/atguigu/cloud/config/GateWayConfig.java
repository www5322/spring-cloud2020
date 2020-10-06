/**
 * GateWayConfig.java 2020年9月25日
 */
package com.atguigu.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * <b>GateWayConfig</b> is 使用硬编码的方式配置路由映射路径
 * </p>
 *
 * @since 2020年9月25日
 * @author zengwk
 * @version $Id$
 */
@Configuration
public class GateWayConfig {

	@Bean
	public RouteLocator customRouteLocatorGuoNei(RouteLocatorBuilder routeLocatorBuilder) {
		RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
		// 表示访问http://localhost:9527/guonei 会跳转到 http://news.baidu.com/guonei
		routes.route("path_route_atguigu", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
		return routes.build();
	}


	@Bean
	public RouteLocator customRouteLocatorGuoJi(RouteLocatorBuilder routeLocatorBuilder) {
		RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
		// 表示访问http://localhost:9527/guoji 会跳转到 http://news.baidu.com/guoji
		routes.route("path_route_atguigu2", r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
		return routes.build();
	}

}
