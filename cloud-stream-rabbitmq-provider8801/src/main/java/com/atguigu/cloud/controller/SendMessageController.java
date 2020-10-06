/**
 * SendMessageController.java 2020年9月27日
 */
package com.atguigu.cloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.service.IMessageProvider;

/**
 * <p>
 * <b>SendMessageController</b> is 
 * </p> http://localhost:8801/sendMessage
 *
 * @since 2020年9月27日
 * @author zengwk
 * @version $Id$
 */
@RestController
public class SendMessageController {

	@Resource
	private IMessageProvider messageProvider;

	@GetMapping(value = "/sendMessage")
	public String sendMessage() {
		return messageProvider.send();
	}

}
