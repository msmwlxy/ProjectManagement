package org.future.projectManagement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * 教务处审核人
 * history
 * 2015/1/25 创建文件
 */
@Entity
public class TAOAudit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*工号**/
	private String jobNumber;
	/*姓名**/
	private String name;
	/*电话**/
	private String telphone;
	/*邮箱**/
	private String email;
	/*职务/职位**/
	private Position position;
	/*密码**/
	private String password;
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
	@Column(length=20)
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	@Column(length=35,nullable=false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@ManyToOne
	@JoinColumn(name="pId")
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	@Column(length=35,nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}