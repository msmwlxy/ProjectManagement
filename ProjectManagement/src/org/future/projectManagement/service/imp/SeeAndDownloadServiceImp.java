package org.future.projectManagement.service.imp;

import javax.annotation.Resource;

import org.future.projectManagement.dao.SeeAndDownloadDao;
import org.future.projectManagement.service.SeeAndDownloadService;
import org.springframework.stereotype.Component;
@Component
public class SeeAndDownloadServiceImp implements SeeAndDownloadService{
	private SeeAndDownloadDao seeAndDownloadDao;
	
	public SeeAndDownloadDao getSeeAndDownloadDao() {
		return seeAndDownloadDao;
	}
	@Resource
	public void setSeeAndDownloadDao(SeeAndDownloadDao seeAndDownloadDao) {
		this.seeAndDownloadDao = seeAndDownloadDao;
	}
	public <T> T find(Class<T> entity, Integer id){
		return seeAndDownloadDao.find(entity, id);
	}
}
