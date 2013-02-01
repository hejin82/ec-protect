package com.isoftstone.agiledev.hrdemo.log.web.query;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isoftstone.agiledev.core.OperationPrompt;
import com.isoftstone.agiledev.hrdemo.log.app.log.ILogManager;
import com.isoftstone.agiledev.hrdemo.log.app.log.Log;

@Controller
public class QueryMgtController {

	@Resource
	private ILogManager logManager;

	
	
	@RequestMapping
	public OperationPrompt add(@Valid Log log){
		System.out.print("++++++++=====in add method====++++++++++");
		OperationPrompt operPrompt = null;
		try {
			this.logManager.add(log);
			operPrompt = new OperationPrompt("添加成功", true);
		} catch (Exception e) {
			operPrompt = new OperationPrompt("添加失败", false);
			e.printStackTrace();
		}
		
		return operPrompt;
	}
	
	@RequestMapping
	public OperationPrompt update(Log log){
		System.out.print("++++++++=====in update method====++++++++++");

		OperationPrompt r = null;
		try {
			this.logManager.update(log);
			r = new OperationPrompt("修改成功", true);
		} catch (Exception e) {
			r = new OperationPrompt("修改失败", false);
			e.printStackTrace();
		}
		return r;
	}
	
}