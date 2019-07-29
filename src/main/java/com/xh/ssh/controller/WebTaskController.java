package com.xh.ssh.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.ssh.model.WebTask;
import com.xh.ssh.service.WebTaskService;

/**
 * <b>Title: </b>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2019年7月29日
 */
@RestController
public class WebTaskController {

	@Resource
	private WebTaskService webTaskService;

	@RequestMapping("/list")
	public List<WebTask> hello() {

		return webTaskService.findAll();
	}

}
