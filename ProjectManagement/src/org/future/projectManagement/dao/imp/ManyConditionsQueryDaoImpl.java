package org.future.projectManagement.dao.imp;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.future.projectManagement.dao.ManyConditionsQueryDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unchecked")
public class ManyConditionsQueryDaoImpl implements ManyConditionsQueryDao {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int getCount(int cId, Date startTime, Date endTime, int pId,
			int psId, Boolean outStanding) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<?> search(int cId, Date startTime, Date endTime, int pId,
			int psId, Boolean outStanding, int maxRow, int currentPage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHQL(List<Object> l, int cId, Date startTime, Date endTime,
			int iId, int psId, Boolean outStanding) {
		StringBuffer hql = new StringBuffer("");
		//院系id
		boolean collegeId = cId != 0;
		//开始时间
		boolean start = startTime != null;
		//结束时间
		boolean end = endTime != null;
		//指导老师id
		boolean instructorId = iId != 0;
		//状态id
		boolean projectStatus = psId != 0;
		//是否优秀
		boolean outStand = outStanding == true;
		
		//TODO
		
		return null;
	}

}
