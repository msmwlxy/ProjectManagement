package org.future.projectManagement.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/*
 * 指导老师
 * history
 * 2015/1/25 创建文件
 */
@Entity
public class Instructor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*工号**/
	private String jobNumber;
	/*姓名**/
	private String name;
	/*职务/职位**/
	private Position position;
	/*学院/单位**/
	private College college;
	/*电话**/
	private String phone;
	/*邮箱**/
	private String email;
	/*密码**/
	private Set<Project> guideProject = new HashSet<Project>();
	@Id
	public String getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	@Column(length=10,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@ManyToOne
	@JoinColumn(name="pId")
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	@ManyToOne
	@JoinColumn(name="cId")
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Column(length=25,nullable=false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(length=35,nullable=false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@ManyToMany(mappedBy="instructors")
	public Set<Project> getGuideProject() {
		return guideProject;
	}
	public void setGuideProject(Set<Project> guideProject) {
		this.guideProject = guideProject;
	}
	
}
