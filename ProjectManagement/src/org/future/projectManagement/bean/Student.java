package org.future.projectManagement.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/*
 * 学生
 * history
 * 2015/1/25 创建文件
 */
@Entity
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*学号**/
	private String studentNo;
	/*姓名**/
	private String name;
	/*负责的项目**/
	private Set<Project> responsibleProject = new HashSet<Project>();
	/*电话**/
	private String telphone;
	/*年级**/
	private String grade;
	/*邮箱**/
	private String email;
	/*学院**/
	private College college;
	/*登录密码**/
	private String password;
	@Id
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	@Column(length=20,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(cascade=CascadeType.ALL,mappedBy="principal")
	public Set<Project> getResponsibleProject() {
		return responsibleProject;
	}
	public void setResponsibleProject(Set<Project> responsibleProject) {
		this.responsibleProject = responsibleProject;
	}
	@Column(length=20)
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	@Column(length=10,nullable=false)
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Column(length=25,nullable=false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@ManyToOne
	@JoinColumn(name="cId")
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Column(length=35)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
