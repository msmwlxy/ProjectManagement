package org.future.projectManagement.dao.imp;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Student;
import org.future.projectManagement.dao.StudentDao;
import org.future.projectManagement.utils.QueryResult;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDaoImp implements StudentDao{
	
	private SessionFactory sessionFactory;
	
	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//添加学生
	@Override
	public void add(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.save(student);
	}
	//根据id查找学生
	@Override
	public Student find(Class<Student> student, int id) {
		Session session = sessionFactory.getCurrentSession();
		return (Student)session.get(student, id);

	}
	//更新学生信息
	@Override
	public void Update(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.update(student);
	}
	//删除学生
	@Override
	public void delete(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(student);
		
	}
	//删除一批学生
	@Override
	public void delete(List<Student> list) {
		
		Session session = sessionFactory.getCurrentSession();
		for(Student student:list){
			session.delete(student);
		}
		
	}
	//根据开始索引，最大记录数和查询条件来得到要查询的学生集合,并且对结果集进行排序
	@Override
	public QueryResult<Student> getQueryResult(int startIndex, int MaxResults,
			Object[] parameters, String where,
			LinkedHashMap<String, String> orderBy) {
		
		Session session = sessionFactory.getCurrentSession();
		QueryResult<Student> qr = new QueryResult<Student>();
		Query query = session.createQuery("select o from Student o "+(where==null||"".equals(where.trim())?"":"where "+where+" ")+buildOrderBy(orderBy));
	
		if(startIndex!=-1&&MaxResults!=-1){
			query.setFirstResult(startIndex).setMaxResults(MaxResults);
		}
		this.setParameters(query, parameters);
		qr.setResult(query.list());
		
		query = session.createQuery("select count(o) from Student o "+(where==null||"".equals(where.trim())?"":"where "+where+""));
		this.setParameters(query, parameters);
		qr.setTotalResult((Integer)query.uniqueResult());
		
		return qr;
	}
	//查找所有的学生
	@Override
	public QueryResult<Student> getQueryResult() {
		return this.getQueryResult(-1, -1, null, null, null);
		
	}
	//根据开始索引，最大记录数和查询条件得到要查询的学生的集合
	@Override
	public QueryResult<Student> getQueryResult(int startIndex, int MaxResults,
			Object[] parameters, String where) {
		return this.getQueryResult(startIndex, MaxResults, parameters, where, null);
	}
	//根据开始索引和要查询的最大记录数得到要查询的学生集合，并且对结果集进行排序
	@Override
	public QueryResult<Student> getQueryResult(int startIndex, int MaxResults,
			LinkedHashMap<String, String> orderBy) {
		
		return this.getQueryResult(startIndex, MaxResults, null, null, orderBy);
	}
	//根据查询条件得到要查询的结果集，并且对结果集中的学生进行排序
	@Override
	public QueryResult<Student> getQueryResult(Object[] parameters,
			String where, LinkedHashMap<String, String> orderBy) {
		
		return this.getQueryResult(-1, -1, parameters, where, orderBy);
	}
	//根据开始索引和要查询的最大记录数得到要查询的结果
	@Override
	public QueryResult<Student> getQueryResult(int startIndex, int MaxResults) {
		
		return this.getQueryResult(startIndex, MaxResults, null, null, null);
	}
	//根据查询条件得到要查询的结果集
	@Override
	public QueryResult<Student> getQueryResult(Object[] parameters, String where) {
		
		return this.getQueryResult(-1, -1, parameters, where, null);
	}
	//根据map集合orderBy中的key和value构建出排序语句
	public String buildOrderBy(LinkedHashMap<String,String> orderBy){
		StringBuffer sb = new StringBuffer();
		if(orderBy!=null&&orderBy.size() > 0){
			sb.append(" order by ");
			for(String key:orderBy.keySet()){
				sb.append("o."+key+" ").append(orderBy.get(key)).append(",");
			}
			sb.deleteCharAt(sb.length()-1);
			return sb.toString();
		}
		return "";
		
	}
	//设置查询中的条件参数
	private void setParameters(Query query, Object[] parameters) {
			
			if(parameters!=null&&parameters.length > 0){
				for(int i = 0;i < parameters.length;i++){
					query.setParameter(i,parameters[i]);
				}
			}
			
		}

	

	
}
