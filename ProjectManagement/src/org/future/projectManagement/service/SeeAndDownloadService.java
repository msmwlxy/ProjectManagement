package org.future.projectManagement.service;


public interface SeeAndDownloadService {
	/**根据传过来的id查找对象*/
	public <T> T find(Class<T> entity, Integer id);
}
