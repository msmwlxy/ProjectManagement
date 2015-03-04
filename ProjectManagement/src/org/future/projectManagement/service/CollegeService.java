package org.future.projectManagement.service;

import java.util.LinkedHashMap;

import org.future.projectManagement.bean.College;

import org.future.projectManagement.utils.QueryResult;

public interface CollegeService {
	
	public QueryResult<College> getQueryResult(Class<College> entityClass);
	
}
