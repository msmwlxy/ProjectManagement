package org.future.projectManagement.dao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.future.projectManagement.dao.LoginDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class LoginDaoImp extends BaseDaoImp implements LoginDao {
	
	public <T> List<T> findAll(Class<T> obj) {
		String objName = obj.getSimpleName();		// 获取类名
		String hql = "from " + objName ;
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		return query.list();
	}
	
}
