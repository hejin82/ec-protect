package com.isoftstone.agiledev.hrdemo.log.app.internal.log;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isoftstone.agiledev.core.query.mybatis.ParametersMapBuilder;
import com.isoftstone.agiledev.hrdemo.log.app.log.ILogManager;
import com.isoftstone.agiledev.hrdemo.log.app.log.Log;


@Transactional
@Service
public class LogManager implements ILogManager{

	@Resource
	private SqlSession sqlSession;
	
	@Resource
	private ParametersMapBuilder parametersMapBuilder;

	@Override
	public void add(Log log) {
		
	}

	@Override
	public void update(Log log) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Log> list(String name, int start, int end, String orderBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Log findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal(Log name) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
