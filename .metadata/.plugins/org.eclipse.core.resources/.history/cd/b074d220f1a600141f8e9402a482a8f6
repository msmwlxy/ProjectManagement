package org.future.projectManagement.dao;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Student;
import org.future.projectManagement.utils.QueryResult;
import org.hibernate.SessionFactory;

public interface StudentDao{
	
	public abstract SessionFactory getSessionFactory();
	@Resource
	public abstract void setSessionFactory(SessionFactory sessionFactory);
	//添加学生
	public void add(Student student);
	//根据id查找学生
	public Student find(Class<Student> Student,int id);
	//更新学生信息
	public void Update(Student student);
	//删除学生
	public void delete(Student student);
	//删除一批学生
	public void delete(List<Student> list);
	
	//查找所有的学生
	public  QueryResult<Student> getQueryResult();
	//根据开始索引，最大记录数和查询条件来得到要查询的学生集合,并且对结果集进行排序
	public  QueryResult<Student> getQueryResult(int startIndex,int MaxResults,Object[] parameters,
			String where,LinkedHashMap<String,String> orderBy);
	//根据开始索引，最大记录数和查询条件得到要查询的学生的集合
	public  QueryResult<Student> getQueryResult(int startIndex,int MaxResults,Object[] parameters,
			String where);
	//根据开始索引和要查询的最大记录数得到要查询的学生集合，并且对结果集进行排序
	public  QueryResult<Student> getQueryResult(int startIndex,int MaxResults,
			LinkedHashMap<String,String> orderBy);
	//根据查询条件得到要查询的结果集，并且对结果集中的学生进行排序
	public  QueryResult<Student> getQueryResult(Object[] parameters,String where,
			LinkedHashMap<String,String> orderBy);
	//根据开始索引和要查询的最大记录数得到要查询的结果
	public  QueryResult<Student> getQueryResult(int startIndex,int MaxResults);
	//根据查询条件得到要查询的结果集
	public  QueryResult<Student> getQueryResult(Object[] parameters, String where);
	
}