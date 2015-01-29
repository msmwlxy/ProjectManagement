package org.future.projectManagement.dao.imp;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Entity;

import org.future.projectManagement.dao.BaseDao;
import org.future.projectManagement.utils.QueryResult;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class BaseDaoImp implements BaseDao{
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
			//添加记录
			@Override
			public void add(Object object) {
				Session session = sessionFactory.getCurrentSession();
				session.save(object);
			}
			//根据id(int类型)查找记录
			@Override
			public <T> T find(Class<T> object, int id) {
				Session session = sessionFactory.getCurrentSession();
				return (T)session.get(object, id);
		
			}
			
			//根据id(String类型)查找记录
			@Override
			public <T> T find(Class<T> object, String id) {
				Session session = sessionFactory.getCurrentSession();
				return (T)session.get(object, id);
		
			}
			//更新记录信息
			@Override
			public void Update(Object object) {
				Session session = sessionFactory.getCurrentSession();
				session.update(object);
			}
			//删除记录
			@Override
			public void delete(Object object) {
				Session session = sessionFactory.getCurrentSession();
				session.delete(object);
				
			}
			//删除一批记录
			@Override
			public <T> void delete(List<T> list) {
				
				Session session = sessionFactory.getCurrentSession();
				for(Object object:list){
					session.delete(object);
				}
				
			}
			//根据开始索引，最大记录数和查询条件来得到要查询的记录集合,并且对结果集进行排序
			@Override
			public <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex, int MaxResults,
					Object[] parameters, String where,
					LinkedHashMap<String, String> orderBy) {
				
				Session session = sessionFactory.getCurrentSession();
				QueryResult<T> qr = new QueryResult<T>();
				Query query = session.createQuery("select o from "+getEntityName(entityClass)+" o "+(where==null||"".equals(where.trim())?"":"where "+where+" ")+buildOrderBy(orderBy));
			
				if(startIndex!=-1&&MaxResults!=-1){
					query.setFirstResult(startIndex).setMaxResults(MaxResults);
				}
				this.setParameters(query, parameters);
				qr.setResult(query.list());
				
				query = session.createQuery("select count(o) from "+getEntityName(entityClass)+" o "+(where==null||"".equals(where.trim())?"":"where "+where+""));
				this.setParameters(query, parameters);
				qr.setTotalResult((Integer)query.uniqueResult());
				
				return qr;
			}
			//查找所有的记录
			@Override
			public <T> QueryResult<T> getQueryResult(Class<T> entityClass) {
				return this.getQueryResult(entityClass,-1, -1, null, null, null);
				
			}
			//根据开始索引，最大记录数和查询条件得到要查询的记录的集合
			@Override
			public <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex, int MaxResults,
					Object[] parameters, String where) {
				return this.getQueryResult(entityClass,startIndex, MaxResults, parameters, where, null);
			}
			//根据开始索引和要查询的最大记录数得到要查询的记录集合，并且对结果集进行排序
			@Override
			public <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex, int MaxResults,
					LinkedHashMap<String, String> orderBy) {
				
				return this.getQueryResult(entityClass,startIndex, MaxResults, null, null, orderBy);
			}
			//根据查询条件得到要查询的结果集，并且对结果集中的记录进行排序
			@Override
			public <T> QueryResult<T> getQueryResult(Class<T> entityClass,Object[] parameters,
					String where, LinkedHashMap<String, String> orderBy) {
				
				return this.getQueryResult(entityClass,-1, -1, parameters, where, orderBy);
			}
			//根据开始索引和要查询的最大记录数得到要查询的结果
			@Override
			public <T> QueryResult<T> getQueryResult(Class<T> entityClass,int startIndex, int MaxResults) {
				
				return this.getQueryResult(entityClass,startIndex, MaxResults, null, null, null);
			}
			//根据查询条件得到要查询的结果集
			@Override
			public <T> QueryResult<T> getQueryResult(Class<T> entityClass,Object[] parameters, String where) {
				
				return this.getQueryResult(entityClass,-1, -1, parameters, where, null);
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

			public <T> String getEntityName(Class<T> entityClass){
				String entityName = entityClass.getSimpleName();
				Entity entity = entityClass.getAnnotation(Entity.class);
			
				if(entity.name()!=null&&!"".equals(entity.name())){
					entityName = entity.name();
				}
				return entityName;
			}
}
