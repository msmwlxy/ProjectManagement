package org.future.projectManagement.service;

import java.util.List;

import org.future.projectManagement.bean.Project;

public interface ProjectService {
	/*添加一个项目**/
	public void add(Project project);
	
	public List<Project> findBySelect(Object[] parameters,String where);
}
