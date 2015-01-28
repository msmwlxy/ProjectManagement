package org.future.projectManagement.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


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
	@OneToMany(cascade=CascadeType.ALL,mappedBy="projectData")
	public Set<Thesis> getThesises() {
		return Thesises;
	}
	public void setThesises(Set<Thesis> thesises) {
		Thesises = thesises;
	}
	
}