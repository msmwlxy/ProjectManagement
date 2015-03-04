package org.future.projectManagement.service.imp;

import java.util.LinkedHashMap;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Instructor;
import org.future.projectManagement.dao.InstructorDao;
import org.future.projectManagement.service.InstructorService;
import org.future.projectManagement.utils.QueryResult;
import org.springframework.stereotype.Component;
@Component
public class InstructorServiceImp implements InstructorService{
	private InstructorDao instructorDao;

	public InstructorDao getInstructorDao() {
		return instructorDao;
	}
	@Resource
	public void setInstructorDao(InstructorDao instructorDao) {
		this.instructorDao = instructorDao;
	}
	@Override
	public QueryResult<Instructor> getQueryResult(
			Class<Instructor> InstructorClass, Object[] parameters, String where,
			LinkedHashMap<String, String> orderBy) {
		return instructorDao.getQueryResult(Instructor.class, parameters, where,orderBy);
	}
	
	
}
