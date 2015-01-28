package org.future.projectManagement.bean;

import java.util.Date;

import org.future.projectManagement.utils.QueryResult;

public class ProjectAndPage<T> {
	/**
	 * 
	 */
	/*项目id**/
	private Integer projectId;
	/*项目编号**/
	private String number;
	/*项目名称**/
	private String name;
	/*项目开始时间**/
	private Date startTime;
	/*结尾时间**/
	private Date endTime;
	/*总经费**/
	private Float funds;
	/*负责人id**/
	private Integer principalId;
	/*学院id**/
	private Integer collegeId;
	/*项目状态id**/
	private Integer projectStatuId;
	/*项目描述**/
	private String description;
	/*项目类型id**/
	private Integer projectTypeId;
	/*项目组成员id**/
	private Integer[] projectMemberIds;
	
	
	
	
	
	/*当前页**/
	private Integer currentPage = 1;
	/*开始页序号**/
	private Integer startPageIndex = 1;
	/*结尾页序号**/
	private Integer endPageIndex;
	/*开始记录的索引**/
	private Integer startResultIndex;
	/*每页显示的最大记录数**/
	private Integer pageMaxResult = 5;
	/*结果集**/
	private QueryResult<T> qr;
	
	public ProjectAndPage(){}
	
	
	
	public Integer getProjectId() {
		return projectId;
	}



	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getStartTime() {
		return startTime;
	}



	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}



	public Date getEndTime() {
		return endTime;
	}



	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



	public Float getFunds() {
		return funds;
	}



	public void setFunds(Float funds) {
		this.funds = funds;
	}



	public Integer getPrincipalId() {
		return principalId;
	}



	public void setPrincipalId(Integer principalId) {
		this.principalId = principalId;
	}



	public Integer getCollegeId() {
		return collegeId;
	}



	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}



	public Integer getProjectStatuId() {
		return projectStatuId;
	}



	public void setProjectStatuId(Integer projectStatuId) {
		this.projectStatuId = projectStatuId;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Integer getProjectTypeId() {
		return projectTypeId;
	}



	public void setProjectTypeId(Integer projectTypeId) {
		this.projectTypeId = projectTypeId;
	}



	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}



	public void setStartPageIndex(Integer startPageIndex) {
		this.startPageIndex = startPageIndex;
	}



	public void setEndPageIndex(Integer endPageIndex) {
		this.endPageIndex = endPageIndex;
	}



	public void setStartResultIndex(Integer startResultIndex) {
		this.startResultIndex = startResultIndex;
	}



	public void setPageMaxResult(Integer pageMaxResult) {
		this.pageMaxResult = pageMaxResult;
	}



	public void setNumber(QueryResult<T> qr){
		
		if(qr.getTotalResult()%pageMaxResult==0){
			this.endPageIndex = qr.getTotalResult()/pageMaxResult;
		}else{
			this.endPageIndex = (qr.getTotalResult()/pageMaxResult + 1);
		}
		this.qr = qr;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public long getStartPageIndex() {
		return startPageIndex;
	}
	public void setStartPageIndex(int startPageIndex) {
		this.startPageIndex = startPageIndex;
	}
	public long getEndPageIndex() {
		return endPageIndex;
	}
	public void setEndPageIndex(int endPageIndex) {
		this.endPageIndex = endPageIndex;
	}
	public long getStartResultIndex() {
		return startResultIndex;
	}
	public void setStartResultIndex() {
		this.startResultIndex = (this.currentPage-1)*this.pageMaxResult;
	
	}
	public long getPageMaxResult() {
		return pageMaxResult;
	}
	public void setPageMaxResult(int pageMaxResult) {
		this.pageMaxResult = pageMaxResult;
	}
	public QueryResult<T> getQr() {
		return qr;
	}
	public void setQr(QueryResult<T> qr) {
		this.qr = qr;
	}
		
}