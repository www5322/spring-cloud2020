/**
 * MessageProviderImpl.java 2020年9月27日
 */
package com.atguigu.cloud.service.impl;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import com.atguigu.cloud.service.IMessageProvider;

/**
 * <p>
 * <b>MessageProviderImpl</b> is
 * </p>
 *
 * @since 2020年9月27日
 * @author zengwk
 * @version $Id$
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

	@Resource
	private MessageChannel output;

	@Override
	public String send() {
		String serial = UUID.randomUUID().toString();
		output.send(MessageBuilder.withPayload(serial).build());
		System.out.println("*****serial:" + serial);
		return null;
	}

}
