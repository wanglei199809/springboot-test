package com.wl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //标明这是一个springMVC的Controller的控制器
@SpringBootApplication //springboot项目的核心注解，主要目的是开启自动配置
@Configuration//通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
public class HelloApplication {
	
	@RequestMapping("hello") // 映射网络访问路径后缀为hello
	@ResponseBody//用于方法的参数类型前 ， 目的是让Springmvc给自动调用jackson将 请求的json格式数据，转换成java对象 。
	public String hello() {
		return "hello world";
	}
	
	/**
	 * <p>这是一个入口类，在main方法中启动一个应用</p>
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class,args);
	}
}
