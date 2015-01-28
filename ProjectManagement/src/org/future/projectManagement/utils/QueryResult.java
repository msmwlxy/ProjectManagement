package org.future.projectManagement.utils;

import java.util.List;

public class QueryResult<T> {
	
	private List<T>	result;
	private Integer totalResult;
	
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	public Integer getTotalResult() {
		return totalResult;
	}
	public void setTotalResult(Integer totalResult) {
		this.totalResult = totalResult;
	}
	
	
	
}
