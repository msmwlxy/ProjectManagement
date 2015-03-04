package org.future.projectManagement.service.imp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

import javax.annotation.Resource;

import org.future.projectManagement.bean.ProjectData;
import org.future.projectManagement.dao.ProjectDataDao;
import org.future.projectManagement.service.ProjectDataService;
import org.springframework.stereotype.Component;
@Component
public class ProjectDataServiceImp implements ProjectDataService{
	
	private ProjectDataDao projectDataDao;

	public ProjectDataDao getProjectDataDao() {
		return projectDataDao;
	}
	@Resource
	public void setProjectDataDao(ProjectDataDao projectDataDao) {
		this.projectDataDao = projectDataDao;
	}
	/*通过项目id查找项目资料**/
	@Override
	public ProjectData getPdByPid(int projectId) {
		
		return projectDataDao.findByPid(projectId);
	}
	@Override
	public void saveFile(ProjectData projectData, String fileName, File upload,String type) {
		
		String realFileName = fileName.substring(0, fileName.lastIndexOf("."));
		String ext = fileName.substring(fileName.lastIndexOf("."));
		fileName = UUID.randomUUID().toString() + ext;
		
		String filePath = "e:/ProjectManagement/file/project" + projectData.getProject().getProjectId()
					+ "/"+projectData.getProject().getName()+"/"+type+"/";
		File filePathDir = new File(filePath);
		
		if(!filePathDir.exists()){
			filePathDir.mkdirs();
		}
		File file = new File(filePathDir,fileName);
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			FileInputStream fis = new FileInputStream(upload);
			byte[] buffer = new byte[1024];
			int length;
		
				while((length = fis.read(buffer)) > 0){
					fos.write(buffer,0,length);	
				}
				fos.close();
				fis.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		try {
			Method m1 = ProjectData.class.getDeclaredMethod("set"+type+"Name", String.class);
			Method m2 = ProjectData.class.getDeclaredMethod("set"+type+"FileName", String.class);
			try {
				m1.invoke(projectData, fileName);
				m2.invoke(projectData, realFileName);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/*往数据库中增加一个项目资料**/
	@Override
	public void add(ProjectData projectData) {
		projectDataDao.add(projectData);
		
	}
	/*更新项目资料**/
	@Override
	public void update(ProjectData projectData) {
		projectDataDao.Update(projectData);
		
	}
	
	
	
	
	
}
