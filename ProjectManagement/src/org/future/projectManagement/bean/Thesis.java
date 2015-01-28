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
 * 论文
 * history
 * 2015/1/25 创建文件
 */
@Entity
public class Thesis implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*id**/
	private Integer thesisId;
	/*论文名称**/
	private String name;
	/*发表时间**/
	private Date dateline;
	/*项目资料**/
	private ProjectData projectData;
	@Id
	@GeneratedValue
	public Integer getThesisId() {
		return thesisId;
	}
	public void setThesisId(Integer thesisId) {
		this.thesisId = thesisId;
	}
	@Column(length=30,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	public Date getDateline() {
		return dateline;
	}
	public void setDateline(Date dateline) {
		this.dateline = dateline;
	}
	@ManyToOne
	@JoinColumn(name="pdId")
	public ProjectData getProjectData() {
		return projectData;
	}
	public void setProjectData(ProjectData projectData) {
		this.projectData = projectData;
	}
	
}
