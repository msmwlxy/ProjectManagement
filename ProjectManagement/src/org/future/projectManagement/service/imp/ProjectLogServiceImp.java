package org.future.projectManagement.service.imp;

import java.util.LinkedHashMap;

import javax.annotation.Resource;

import org.future.projectManagement.bean.ProjectLog;
import org.future.projectManagement.dao.ProjectLogDao;
import org.future.projectManagement.service.ProjectLogService;
import org.future.projectManagement.utils.QueryResult;
import org.springframework.stereotype.Component;
@Component
public class ProjectLogServiceImp implements ProjectLogService{
	private ProjectLogDao projectLogDao;

	public ProjectLogDao getProjectLogDao() {
		return projectLogDao;
	}
	@Resource
	public void setProjectLogDao(ProjectLogDao projectLogDao) {
		this.projectLogDao = projectLogDao;
	}
	public  QueryResult<ProjectLog> getQueryResult(Class<ProjectLog> entityClass,int startIndex, int MaxResults,
			Object[] parameters, String where,
			LinkedHashMap<String, String> orderBy){
		return projectLogDao.getQueryResult(ProjectLog.class, startIndex, MaxResults, parameters, where, orderBy);
	}
	
}
