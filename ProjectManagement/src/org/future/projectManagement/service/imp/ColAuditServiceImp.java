package org.future.projectManagement.service.imp;

import javax.annotation.Resource;

import org.future.projectManagement.bean.ColAudit;
import org.future.projectManagement.dao.ColAuditDao;
import org.future.projectManagement.service.ColAuditService;
import org.future.projectManagement.utils.QueryResult;
import org.springframework.stereotype.Component;

@Component
public class ColAuditServiceImp implements ColAuditService {

	private ColAuditDao ColAuditDao;
	
	public ColAuditDao getColAuditDao() {
		return ColAuditDao;
	}
	@Resource
	public void setColAuditDao(ColAuditDao ColAuditDao) {
		this.ColAuditDao = ColAuditDao;
	}

	@Override
	public void add(ColAudit ColAudit) {
		ColAuditDao.add(ColAudit);
	}

	@Override
	public void delete(ColAudit ColAudit) {
		ColAuditDao.delete(ColAudit);
	}

	@Override
	public void Update(ColAudit ColAudit) {
		ColAuditDao.Update(ColAudit);
	}

	@Override
	public ColAudit find(Class<ColAudit> ColAuditClass, String jobNumber) {
		return ColAuditDao.find(ColAuditClass, jobNumber);
	}

	@Override
	public QueryResult<ColAudit> getQueryResult(
			Class<ColAudit> ColAuditClass) {
		return ColAuditDao.getQueryResult(ColAuditClass);
	}
	
}
