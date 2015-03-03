package org.future.projectManagement.service;

import org.future.projectManagement.bean.ColAudit;
import org.future.projectManagement.utils.QueryResult;

public interface ColAuditService {
	/**
	 * 增
	 * @param colAudit
	 */
	public void add(ColAudit colAudit);
	/**
	 * 删
	 * @param colAudit
	 */
	public void delete(ColAudit colAudit);
	
	/**
	 * 改
	 * @param colAudit
	 */
	public void Update(ColAudit colAudit);
	
	/**
	 * 查（根据工号查询）
	 * @param ColAuditClass
	 * @param jobNumber
	 * @return
	 */
	public ColAudit find(Class<ColAudit> ColAuditClass, String jobNumber);

	/**
	 * 查询所有
	 * @param ColAuditClass
	 * @return
	 */
	public QueryResult<ColAudit> getQueryResult(Class<ColAudit> ColAuditClass);
}
