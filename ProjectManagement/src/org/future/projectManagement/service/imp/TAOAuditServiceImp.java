package org.future.projectManagement.service.imp;

import javax.annotation.Resource;

import org.future.projectManagement.bean.TAOAudit;
import org.future.projectManagement.dao.TAOAuditDao;
import org.future.projectManagement.service.TAOAuditService;
import org.future.projectManagement.utils.QueryResult;
import org.springframework.stereotype.Component;

@Component
public class TAOAuditServiceImp implements TAOAuditService {

	private TAOAuditDao TAOAuditDao;
	
	public TAOAuditDao getTAOAuditDao() {
		return TAOAuditDao;
	}
	@Resource
	public void setTAOAuditDao(TAOAuditDao TAOAuditDao) {
		this.TAOAuditDao = TAOAuditDao;
	}

	@Override
	public void add(TAOAudit TAOAudit) {
		TAOAuditDao.add(TAOAudit);
	}

	@Override
	public void delete(TAOAudit TAOAudit) {
		TAOAuditDao.delete(TAOAudit);
	}

	@Override
	public void Update(TAOAudit TAOAudit) {
		TAOAuditDao.Update(TAOAudit);
	}

	@Override
	public TAOAudit find(Class<TAOAudit> TAOAuditClass, String jobNumber) {
		return TAOAuditDao.find(TAOAuditClass, jobNumber);
	}

	@Override
	public QueryResult<TAOAudit> getQueryResult(
			Class<TAOAudit> TAOAuditClass) {
		return TAOAuditDao.getQueryResult(TAOAuditClass);
	}
	
}
