package org.future.projectManagement.utils;

import java.util.List;

public class QueryResult<T> {
	/*查询的结果集**/
	private List<T>	results;
	/*查询的结果集的总数**/
	private Integer totalResults;
	
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	

	
	
	
}
