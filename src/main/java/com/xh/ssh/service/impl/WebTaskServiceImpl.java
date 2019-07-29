package com.xh.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xh.ssh.dao.WebTaskDao;
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
@Transactional(readOnly = true)
@Service
public class WebTaskServiceImpl implements WebTaskService {

	@Resource
	private WebTaskDao webTaskDao;

	@Override
	public List<WebTask> findAll() {

		return webTaskDao.findAll();
	}

}
