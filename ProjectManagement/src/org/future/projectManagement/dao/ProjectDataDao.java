package org.future.projectManagement.dao;

import org.future.projectManagement.bean.ProjectData;

public interface ProjectDataDao extends BaseDao{
	/*通过项目id查找项目资料**/
	ProjectData findByPid(int projectId);
	
}
