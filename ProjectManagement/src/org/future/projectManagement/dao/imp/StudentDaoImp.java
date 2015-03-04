package org.future.projectManagement.dao.imp;

import org.future.projectManagement.bean.Project;
import org.future.projectManagement.bean.ProjectData;
import org.future.projectManagement.dao.StudentDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;



@Component
public class StudentDaoImp extends BaseDaoImp implements StudentDao {
	
	/*通过项目id查找项目资料**/	
	@Override
	public ProjectData findByPid(int projectId) {
		
		Session session = this.getSessionFactory().getCurrentSession();
		Project project = new Project();
		project.setProjectId(projectId);
		Query query = session.createQuery("select o from ProjectData o where o.project = ?").setParameter(0, project);
		return (ProjectData) query.uniqueResult();
		
	}

}
