/**
 * MyLogGateWayFilter.java 2020年9月25日
 */
package com.atguigu.cloud.filter;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * <p>
 * <b>MyLogGateWayFilter</b> is
 * </p>
 *
 * @since 2020年9月25日
 * @author zengwk
 * @version $Id$
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("***********come in MyLogGateWayFilter:  " + new Date());

		String userName = exchange.getRequest().getQueryParams().getFirst("userName");
		if (StringUtils.isBlank(userName)) {
			log.info("*******用户名为null，非法用户，o(╥﹏╥)o");
			exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
			return exchange.getResponse().setComplete();
		}

		return chain.filter(exchange);
	}

}
