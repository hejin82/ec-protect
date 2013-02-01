package com.isoftstone.agiledev.hrdemo.log.app.log;

import java.util.List;


public interface ILogManager {

	List<Log> list(String name, int start, int end, String orderBy);
	void add(Log user);
	void update(Log user);
	void remove(int id);
	void remove(int[] ids);
	Log findById(int id);
	int getTotal(Log name);
}
