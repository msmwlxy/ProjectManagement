package org.future.projectManagement.dao;

import java.util.LinkedHashMap;
import java.util.List;
import javax.annotation.Resource;


import org.future.projectManagement.utils.QueryResult;
import org.hibernate.SessionFactory;

public interface BaseDao {
	public  SessionFactory getSessionFactory();
	@Resource
	public  void setSessionFactory(SessionFactory sessionFactory);
	//添加记录
	public void add(Object object);
	//根据id(int类型)查找记录
	public <T> T find(Class<T> object,int id);
	//根据id(String类型)查找记录
	public <T> T find(Class<T> object,String id);
	//更新记录信息
	public void Update(Object object);
	//删除记录
	public void delete(Object object);
	//删除一批记录
	public <T> void delete(List<T> list);
	
	//查找所有的记录
	public  <T> QueryResult<T> getQueryResult(Class<T> entityClass);
	//根据开始索引，最大记录数和查询条件来得到要查询的记录集合,并且对结果集进行排序
	public  <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex,int MaxResults,Object[] parameters,
			String where,LinkedHashMap<String,String> orderBy);
	//根据开始索引，最大记录数和查询条件得到要查询的记录的集合
	public  <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex,int MaxResults,Object[] parameters,
			String where);
	//根据开始索引和要查询的最大记录数得到要查询的记录集合，并且对结果集进行排序
	public  <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex,int MaxResults,
			LinkedHashMap<String,String> orderBy);
	//根据查询条件得到要查询的结果集，并且对结果集中的记录进行排序
	public  <T> QueryResult<T> getQueryResult(Class<T> entityClass,Object[] parameters,String where,
			LinkedHashMap<String,String> orderBy);
	//根据开始索引和要查询的最大记录数得到要查询的结果
	public  <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex,int MaxResults);
	//根据查询条件得到要查询的结果集
	public  <T> QueryResult<T> getQueryResult(Class<T> entityClass,Object[] parameters, String where);
}
