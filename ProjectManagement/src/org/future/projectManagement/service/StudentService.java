package org.future.projectManagement.service;

import java.io.File;
import java.util.LinkedHashMap;



import org.future.projectManagement.bean.College;
import org.future.projectManagement.bean.Project;
import org.future.projectManagement.bean.ProjectAndPage;
import org.future.projectManagement.bean.ProjectData;
import org.future.projectManagement.bean.Student;
import org.future.projectManagement.utils.QueryResult;

public interface StudentService {
	
	
	
	/*根据分页，条件，排序进行查询**/
	public  <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex, int MaxResults,
			Object[] parameters, String where,
			LinkedHashMap<String, String> orderBy);

	//根据查询条件得到要查询的结果集，并且对结果集中的记录进行排序
	public <T> QueryResult<T> getQueryResult(Class<T> StudentClass,Object[] parameters,
			String where, LinkedHashMap<String, String> orderBy);
	/*通过项目id查找项目资料**/
	public ProjectData getPdByPid(int projectId);
	
	//根据申报页面传递过来的参数生成一个项目
	public <T> Project createProject(ProjectAndPage<T> pp);
	//生成修改页面需要的参数
	public <T> void createPPmi(ProjectAndPage<T> pp,Project project);
	//根据修改项目页面传递过来的参数生成一个项目
	public <T> void createUpdateProject(ProjectAndPage<T> pp,Project project);
	
	/*往数据库中增加一个对象**/
	public void add(Object object);
	/*更新一个对象**/
	public void update(Object object);
	/*根据id查找对象**/
	public <T> T find(Class<T> entity, Integer id);
	/*保存上传的文件**/
	public void saveFile(ProjectData projectData, String fileName, File upload,String type);
	/*查询T类所有的记录**/
	public <T> QueryResult<T> getQueryResult(Class<T> entityClass);
	
	public QueryResult<Project> getProjects(Student student);
}
