package org.future.projectManagement.service.imp;

import java.util.LinkedHashMap;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Student;
import org.future.projectManagement.dao.StudentDao;
import org.future.projectManagement.service.StudentService;
import org.future.projectManagement.utils.QueryResult;
import org.springframework.stereotype.Component;
@Component
public class StudentServiceImp implements StudentService {
	
	private StudentDao studentDao;

	

	public StudentDao getStudentDao() {
		return studentDao;
	}

	@Resource
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	/*添加学生**/
	@Override
	public void add(Student student){
		studentDao.add(student);
	}
	
	/*根据学号查找学生**/
	@Override
	public Student find(Class<Student> StudentClass,String id){
		return studentDao.find(StudentClass, id);
	}
	
	/*更新学生信息**/
	@Override
	public void Update(Student student){
		studentDao.Update(student);
	}
	
	//根据开始索引，最大学生数和查询条件来得到要查询的学生集合,并且对结果集进行排序
	@Override
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,int startIndex, int MaxResults,
			Object[] parameters, String where,
			LinkedHashMap<String, String> orderBy)  {
		return studentDao.getQueryResult(StudentClass, startIndex, MaxResults, parameters, where, orderBy);
	}
	
	//查找所有的学生
	
	@Override
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass) {
		return this.getQueryResult(StudentClass,-1, -1, null, null, null);	
	}
	
	//根据开始索引，最大学生数和查询条件得到要查询的学生的集合
	
	@Override
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,int startIndex, int MaxResults,
			Object[] parameters, String where) {
		return this.getQueryResult(StudentClass,startIndex, MaxResults, parameters, where, null);
	}
	
	//根据开始索引和要查询的最大学生数得到要查询的学生集合，并且对结果集进行排序
	
	@Override
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,int startIndex, int MaxResults,
			LinkedHashMap<String, String> orderBy) {
		
		return this.getQueryResult(StudentClass,startIndex, MaxResults, null, null, orderBy);
	}
	
	//根据查询条件得到要查询的结果集，并且对结果集中的学生进行排序
	
	@Override
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,Object[] parameters,
			String where, LinkedHashMap<String, String> orderBy) {
		
		return this.getQueryResult(StudentClass,-1, -1, parameters, where, orderBy);
	}
	
	//根据开始索引和要查询的最大学生数得到要查询的结果
	
	@Override
	public QueryResult<Student> getQueryResult(Class<Student> StudentClass,int startIndex, int MaxResults) {
		
		return this.getQueryResult(StudentClass,startIndex, MaxResults, null, null, null);
	}
	
	//根据查询条件得到要查询的结果集
	
	
	@Override
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,Object[] parameters, String where) {
		
		return this.getQueryResult(StudentClass,-1, -1, parameters, where, null);
	}
}
