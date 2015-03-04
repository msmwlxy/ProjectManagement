package org.future.projectManagement.service.imp;

import javax.annotation.Resource;

import org.future.projectManagement.bean.College;
import org.future.projectManagement.dao.CollegeDao;
import org.future.projectManagement.service.CollegeService;
import org.future.projectManagement.utils.QueryResult;
import org.springframework.stereotype.Component;
@Component
public class CollegeServiceImp implements CollegeService{
	private CollegeDao collegeDao;

	public CollegeDao getCollegeDao() {
		return collegeDao;
	}
	@Resource
	public void setCollegeDao(CollegeDao collegeDao) {
		this.collegeDao = collegeDao;
	}
	
	//查找所有的记录
	@Override
	public QueryResult<College> getQueryResult(Class<College> entityClass) {
		// TODO Auto-generated method stub
		return collegeDao.getQueryResult(entityClass,-1, -1, null, null, null);
	}
}
