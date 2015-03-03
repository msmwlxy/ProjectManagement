package org.future.projectManagement.service;

import java.util.List;

import org.future.projectManagement.bean.Instructor;
import org.future.projectManagement.bean.Student;
import org.future.projectManagement.utils.QueryResult;

public interface InstructorService {
	/**
	 * 增
	 * @param instructor
	 */
	public void add(Instructor instructor);
	/**
	 * 删
	 * @param instructor
	 */
	public void delete(Instructor instructor);
	
	/**
	 * 改
	 * @param instructor
	 */
	public void Update(Instructor instructor);
	
	/**
	 * 查（根据工号查询）
	 * @param InstructorClass
	 * @param jobNumber
	 * @return
	 */
	public Instructor find(Class<Instructor> InstructorClass, String jobNumber);

	/**
	 * 查询所有
	 * @param InstructorClass
	 * @return
	 */
	public QueryResult<Instructor> getQueryResult(Class<Instructor> InstructorClass);
}
