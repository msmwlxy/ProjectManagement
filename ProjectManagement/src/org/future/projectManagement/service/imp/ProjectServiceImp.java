package org.future.projectManagement.service.imp;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Project;
import org.future.projectManagement.dao.ProjectDao;
import org.future.projectManagement.service.ProjectService;
import org.springframework.stereotype.Component;
@Component
public class ProjectServiceImp implements ProjectService{
	
	private ProjectDao projectDao;
	
	public ProjectDao getProjectDao() {
		return projectDao;
	}
	@Resource
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}
	/*添加一个项目**/
	public void add(Project project){
		projectDao.add(project);
	}
	
}