package org.future.projectManagement.service.imp;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Thesis;
import org.future.projectManagement.dao.ThesisDao;
import org.future.projectManagement.service.ThesisService;
import org.springframework.stereotype.Component;
@Component
public class ThesisServiceImp implements ThesisService{
	
	private ThesisDao thesisDao;
	
	
	public ThesisDao getThesisDao() {
		return thesisDao;
	}

	@Resource
	public void setThesisDao(ThesisDao thesisDao) {
		this.thesisDao = thesisDao;
	}

	//增加一篇论文
	@Override
	public void add(Thesis thesis) {
		thesisDao.add(thesis);
		
	}

}
