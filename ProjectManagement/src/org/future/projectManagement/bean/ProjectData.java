package org.future.projectManagement.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;


/*
 * 项目资料
 * history
 * 2015/1/25 创建文件
 * 
 */
@Entity
public class ProjectData implements Serializable{

	private static final long serialVersionUID = 1L;
	/*id**/
	private Integer projectDataId;
	/*创新项目**/
	private Project project;
	/*成果图片**/
	private Set<AchImage> achImages = new HashSet<AchImage>();
	/*结项报告名**/
	private String overReportName;
	/*结项报告文件名**/
	private	String overReportFileName;
	/*中期检查名**/
	private String midCheckName;
	/*中期检查文件名**/
	private String midCheckFileName;
	/*论文**/
	private Set<Thesis> Thesises = new HashSet<Thesis>();
	
	@Id
	@GeneratedValue
	public Integer getProjectDataId() {
		return projectDataId;
	}
	public void setProjectDataId(Integer projectDataId) {
		this.projectDataId = projectDataId;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pId",unique=true)
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@OneToMany(cascade={CascadeType.ALL},mappedBy="projectData")
	public Set<AchImage> getAchImages() {
		return achImages;
	}
	public void setAchImages(Set<AchImage> achImages) {
		this.achImages = achImages;
	}
	@OneToMany(cascade=CascadeType.ALL,mappedBy="projectData",fetch=FetchType.EAGER)
	public Set<Thesis> getThesises() {
		return Thesises;
	}
	
	public void setThesises(Set<Thesis> thesises) {
		Thesises = thesises;
	}
	
	public String getOverReportFileName() {
		return overReportFileName;
	}
	public void setOverReportFileName(String overReportFileName) {
		this.overReportFileName = overReportFileName;
	}
	public String getMidCheckFileName() {
		return midCheckFileName;
	}
	public void setMidCheckFileName(String midCheckFileName) {
		this.midCheckFileName = midCheckFileName;
	}
	public String getOverReportName() {
		return overReportName;
	}
	public void setOverReportName(String overReportName) {
		this.overReportName = overReportName;
	}
	
	public String getMidCheckName() {
		return midCheckName;
	}
	public void setMidCheckName(String midCheckName) {
		this.midCheckName = midCheckName;
	}
	@Transient
	public String getOverReportFilePath(){
		return "file/project" + this.getProject().getProjectId() +"/OverReport/" + this.getOverReportName(); 
	}
	@Transient
	public String getMidFilePath(){
		return  "file/project" + this.getProject().getProjectId() +"/MidCheck/" + this.getMidCheckName(); 
	}
}
