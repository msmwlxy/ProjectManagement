package org.future.projectManagement.service;

import org.future.projectManagement.bean.TAOAudit;
import org.future.projectManagement.utils.QueryResult;

public interface TAOAuditService {
	/**
	 * 增
	 * @param TAOAudit
	 */
	public void add(TAOAudit TAOAudit);
	/**
	 * 删
	 * @param TAOAudit
	 */
	public void delete(TAOAudit TAOAudit);
	
	/**
	 * 改
	 * @param TAOAudit
	 */
	public void Update(TAOAudit TAOAudit);
	
	/**
	 * 查（根据工号查询）
	 * @param TAOAuditClass
	 * @param jobNumber
	 * @return
	 */
	public TAOAudit find(Class<TAOAudit> TAOAuditClass, String jobNumber);

	/**
	 * 查询所有
	 * @param TAOAuditClass
	 * @return
	 */
	public QueryResult<TAOAudit> getQueryResult(Class<TAOAudit> TAOAuditClass);
}
