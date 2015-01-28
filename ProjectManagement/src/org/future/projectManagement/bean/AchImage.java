package org.future.projectManagement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * 成果图片
 * history
 * 2015/1/25
 * 
 */
@Entity
public class AchImage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*id**/
	private Integer achImageId;
	/*图片名**/
	private String 	imageName;
	/*项目资料**/
	private ProjectData projectData;
	
	@Id
	@GeneratedValue
	public Integer getAchImageId() {
		return achImageId;
	}
	public void setAchImageId(Integer achImageId) {
		this.achImageId = achImageId;
	}
	@Column(length=50,nullable=false)
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
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
