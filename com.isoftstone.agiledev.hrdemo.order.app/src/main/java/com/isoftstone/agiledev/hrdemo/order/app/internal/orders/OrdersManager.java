package com.isoftstone.agiledev.hrdemo.order.app.internal.orders;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isoftstone.agiledev.hrdemo.order.app.orders.IOrdersManager;
import com.isoftstone.agiledev.hrdemo.order.app.orders.Orders;

@Transactional
@Service
public class OrdersManager implements IOrdersManager{

//	@Resource
//	private SqlSession sqlSession;
//	
//	@Resource
//	private ParametersMapBuilder parametersMapBuilder;
	
	@Override
	public List<Orders> list(String name, int start, int end, String orderBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Orders user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Orders user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Orders findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
