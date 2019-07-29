package com.xh.ssh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>Title: </b>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2019年7月29日
 */
@RestController
public class BootController {

	@RequestMapping("/hello")
	public String hello() {

		return "Hello Wold!";
	}
}
