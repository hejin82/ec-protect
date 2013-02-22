package com.isoftstone.agiledev.hrdemo.order.web.orders;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.isoftstone.agiledev.core.OperationPrompt;
import com.isoftstone.agiledev.core.init.InitializeModel;
import com.isoftstone.agiledev.core.init.Initializeable;
import com.isoftstone.agiledev.core.query.QueryParameters;
import com.isoftstone.agiledev.core.query.QueryResult;
import com.isoftstone.agiledev.hrdemo.order.app.orders.IOrdersManager;
import com.isoftstone.agiledev.hrdemo.order.app.orders.Orders;


@Controller
public class OrdersMgtController implements Initializeable{

	@Resource
	private IOrdersManager ordersManager;

	@Override
	@RequestMapping
	public InitializeModel init() {
		return new InitializeModel(new Class[]{Orders.class});
	}
	
	@RequestMapping
	public QueryResult<Orders> list(@RequestParam(value="name", required=false) final String name,
				QueryParameters queryParameters){
		return null;
	}
	
	@RequestMapping
	public OperationPrompt add( Orders order){
		
		return null;
	}
	
	@RequestMapping
	public OperationPrompt update(Orders user){

		return null;
	}
	
}