package org.future.projectManagement.service;

import java.util.List;

public interface LoginService {
	// 用户登陆操作
	public boolean findByLoginNameAndPassword(Integer identity,
			String accountNum, String password);
	// 注册准备数据（是否可以用泛型做）
	public <T> List<T> findAll(Class<T> obj);
	
	// 根据具体的id条件来查询特定的学院和职位
	public <T> T findById(Class<T> obj,Integer id);
}
