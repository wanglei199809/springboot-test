package com.wl.demo.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
	
	// 获取日志记录器
	private static final Logger LOG = LoggerFactory.getLogger(Hello.class);

	@RequestMapping("/do")
	public String hello() {
		System.out.println("我执行了.");
		LOG.info("这是Hello.test");
		return "hello World!";
	}
	
}
