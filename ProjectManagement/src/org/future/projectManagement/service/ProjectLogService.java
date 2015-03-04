package org.future.projectManagement.service;

import java.util.LinkedHashMap;

import org.future.projectManagement.bean.ProjectLog;
import org.future.projectManagement.utils.QueryResult;

public interface ProjectLogService {
	public  QueryResult<ProjectLog> getQueryResult(Class<ProjectLog> entityClass,int startIndex, int MaxResults,
			Object[] parameters, String where,
			LinkedHashMap<String, String> orderBy);
}
