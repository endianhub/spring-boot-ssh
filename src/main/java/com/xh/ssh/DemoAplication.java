package com.xh.ssh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>Title: Spring Boot应用启动类</p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月24日
 */
@SpringBootApplication
public class DemoAplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(DemoAplication.class, args);
	}
}
