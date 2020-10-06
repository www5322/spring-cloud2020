/**
 * FlowLimitController.java 2020年10月1日
 */
package com.atguigu.cloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>FlowLimitController</b> is
 * </p>
 *
 * @since 2020年10月1日
 * @author zengwk
 * @version $Id$
 */
@RestController
@Slf4j
public class FlowLimitController {

	@GetMapping("/testA")
	public String testA() {
		log.info(Thread.currentThread().getName() + "\t" + "...testA");
		return "--------testA";
	}

	@GetMapping("/testB")
	public String testB() {
		log.info(Thread.currentThread().getName() + "\t" + "...testB");
		return "--------testB";
	}

	@GetMapping("/testD")
	public String testD() {
		log.info("----testD");
		int i = 10 / 0;
		return "--------testD";
	}

	@GetMapping("/testE")
	public String testE() {
		log.info("----testE");
		int i = 10 / 0;
		return "--------testE";
	}

	/**
	 * @param p1 required = false 表示p1参数可以不传
	 * @param p2 required = false 表示p1参数可以不传
	 * @return
	 * @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
	 * testHotKey:表示资源名称，可与访问路径相同；
	 * blockHandler：表示并发访问是出现热点问题时使用deal_testHotKey方法做处理
	 */
	@GetMapping("/testHotKey")
	@SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
	public String testHotKey(@RequestParam(value = "p1", required = false) String p1, @RequestParam(value = "p2", required = false) String p2) {
		return "-----testHotKey";
	}

	public String deal_testHotKey(String p1, String p2, BlockException exception) {
		return "-----热点异常处理，o(╥﹏╥)o";
	}



}
