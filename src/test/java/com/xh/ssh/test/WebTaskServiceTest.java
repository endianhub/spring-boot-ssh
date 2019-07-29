package com.xh.ssh.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xh.ssh.DemoAplication;
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
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoAplication.class) // 指定spring-boot的启动类
public class WebTaskServiceTest {

	@Resource
	private WebTaskService webTaskService;

	@Test
	public void findAll() {
		List<WebTask> list = webTaskService.findAll();
		System.out.println(list.size());
	}
}
