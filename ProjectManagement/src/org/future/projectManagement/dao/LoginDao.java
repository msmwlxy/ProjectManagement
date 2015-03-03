package org.future.projectManagement.dao;

import java.util.List;

public interface LoginDao extends BaseDao {
	
	public <T> List<T> findAll(Class<T> obj);
}
