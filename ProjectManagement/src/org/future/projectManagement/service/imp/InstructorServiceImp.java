package org.future.projectManagement.service.imp;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Instructor;
import org.future.projectManagement.dao.InstructorDao;
import org.future.projectManagement.service.InstructorService;
import org.future.projectManagement.utils.QueryResult;
import org.springframework.stereotype.Component;

@Component
public class InstructorServiceImp implements InstructorService {

	private InstructorDao instructorDao;
	
	public InstructorDao getInstructorDao() {
		return instructorDao;
	}
	@Resource
	public void setInstructorDao(InstructorDao instructorDao) {
		this.instructorDao = instructorDao;
	}

	@Override
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
	}

	@Override
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}

	@Override
	public void Update(Instructor instructor) {
		instructorDao.Update(instructor);
	}

	@Override
	public Instructor find(Class<Instructor> InstructorClass, String jobNumber) {
		return instructorDao.find(InstructorClass, jobNumber);
	}

	@Override
	public QueryResult<Instructor> getQueryResult(
			Class<Instructor> InstructorClass) {
		return instructorDao.getQueryResult(InstructorClass);
	}
	
}
