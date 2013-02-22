package com.isoftstone.agiledev.hrdemo.order.app.orders;

import java.util.List;


public interface IOrdersManager {

	List<Orders> list(String name, int start, int end, String orderBy);
	void add(Orders user);
	void update(Orders user);
	void remove(int id);
	void remove(int[] ids);
	Orders findById(int id);
	int getTotal(String name);
}
