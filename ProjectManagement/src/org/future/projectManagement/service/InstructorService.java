package org.future.projectManagement.service;

import java.util.LinkedHashMap;

import org.future.projectManagement.bean.Instructor;
import org.future.projectManagement.utils.QueryResult;

public interface InstructorService {
	//根据查询条件得到要查询的指导老师，并且对结果集中的指导老师进行排序
		public  QueryResult<Instructor> getQueryResult(Class<Instructor> InstructorClass,Object[] parameters,
				String where, LinkedHashMap<String, String> orderBy);
}
