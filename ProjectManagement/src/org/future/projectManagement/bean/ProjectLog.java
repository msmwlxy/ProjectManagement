package org.future.projectManagement.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * 项目日志
 * history
 * 2015/1/25 创建文件
 */
@Entity
public class ProjectLog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*id**/
	private Integer projectLogId;
	/*操作人id**/
	private String 	operatorId;
	/*操作人姓名**/
	private String operatorName;
	/*操作时间**/
	private Date time;
	/*意见**/
	private String opinion;
	/*项目**/
	private Project project;
	@Id
	@GeneratedValue
	public Integer getProjectLogId() {
		return projectLogId;
	}
	public void setProjectLogId(Integer projectLogId) {
		this.projectLogId = projectLogId;
	}
	@Column(length=20,nullable=false)
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	@Column(length=20,nullable=false)
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	@ManyToOne
	@JoinColumn(name="pId")
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Column(length=600)
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
	
}