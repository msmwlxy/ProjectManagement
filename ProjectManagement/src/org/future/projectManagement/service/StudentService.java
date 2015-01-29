package org.future.projectManagement.service;

import java.util.LinkedHashMap;

import org.future.projectManagement.bean.Student;

import org.future.projectManagement.utils.QueryResult;

public interface StudentService {
	
	/*增添学生**/
	public void add(Student student);
	/*根据学号查找学生**/
	public Student find(Class<Student> StudentClass,String id);
	/*更新学生信息**/
	public void Update(Student student);
	//根据开始索引，最大学生数和查询条件来得到要查询的学生集合,并且对结果集进行排序
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,int startIndex, int MaxResults,
			Object[] parameters, String where,
			LinkedHashMap<String, String> orderBy);
	//查找所有的学生
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass);
	//根据开始索引，最大学生数和查询条件得到要查询的学生的集合
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,int startIndex, int MaxResults,
			Object[] parameters, String where);
	//根据开始索引和要查询的最大学生数得到要查询的学生集合，并且对结果集进行排序
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,int startIndex, int MaxResults,
			LinkedHashMap<String, String> orderBy);
	//根据查询条件得到要查询的结果集，并且对结果集中的学生进行排序
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,Object[] parameters,
			String where, LinkedHashMap<String, String> orderBy);
	//根据开始索引和要查询的最大学生数得到要查询的结果
	public QueryResult<Student> getQueryResult(Class<Student> StudentClass,int startIndex, int MaxResults);
	//根据查询条件得到要查询的结果集
	public  QueryResult<Student> getQueryResult(Class<Student> StudentClass,Object[] parameters, String where);
}