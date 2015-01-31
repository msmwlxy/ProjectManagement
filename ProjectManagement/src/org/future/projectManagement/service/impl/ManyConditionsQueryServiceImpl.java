package org.future.projectManagement.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.future.projectManagement.dao.ManyConditionsQueryDao;
import org.future.projectManagement.service.ManyConditionsQueryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//@Service : 标注一个业务逻辑组件类

@Service
@Transactional
@SuppressWarnings("unchecked")
public class ManyConditionsQueryServiceImpl implements
		ManyConditionsQueryService {

	private ManyConditionsQueryDao manyConditionsQueryDao;
	
	public ManyConditionsQueryDao getManyConditionsQueryDao() {
		return manyConditionsQueryDao;
	}
	@Resource
	public void setManyConditionsQueryDao(
			ManyConditionsQueryDao manyConditionsQueryDao) {
		this.manyConditionsQueryDao = manyConditionsQueryDao;
	}

	@Override
	public int getCount(int cId, Date startTime, Date endTime, int iId,
			int psId, Boolean outStanding) {
		StringBuffer hql = new StringBuffer("select count(project.project.id) from project");
		
		Object[] param = this.getParam(hql, cId, startTime, endTime, iId, psId, outStanding);
		
		return manyConditionsQueryDao.getCount(hql.toString(), param);
	}

	@Override
	public List<?> search(int cId, Date startTime, Date endTime, int iId,
			int psId, Boolean outStanding, int maxRow, int currentPage) {
		
		
		return null;
	}
	/**
	 * 作用：创建查询中要用的 hql 和 hql 的参数。因为我们不能确定用户查询条件都是什么
	 * @param hql
	 * @param cId
	 * @param startTime
	 * @param endTime
	 * @param iId
	 * @param psId
	 * @param outStanding
	 * @return
	 */
	private Object[] getParam(StringBuffer hql, int cId, Date startTime, Date endTime, int iId,
			int psId, Boolean outStanding) {
		List<Object> l = new ArrayList<Object>();
		String q = manyConditionsQueryDao.getHQL(l, cId, startTime, endTime, iId, psId, outStanding);
		if(!"".equals(q) && q != null) {
			hql.append(" where ");
			hql.append(q);
		}
		Object[] p = new Object[l.size()];
		int i = 0;
		for(Object o : l) {
			p[i] = o;
			i++;
		}
		
		return p;
	}
}
