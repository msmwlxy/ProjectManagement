package org.future.projectManagement.service;

import java.io.File;

import org.future.projectManagement.bean.ProjectData;

public interface ProjectDataService {
	/*通过项目id查找项目资料**/
	public ProjectData getPdByPid(int projectId);
	/*保存上传的文件**/
	public void saveFile(ProjectData projectData, String fileName, File upload,String type);
	/*往数据库中增加一个项目资料**/
	public void add(ProjectData projectData);
	/*更新项目资料**/
	public void update(ProjectData projectData);
	
	
}
