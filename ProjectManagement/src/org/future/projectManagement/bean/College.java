package org.future.projectManagement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * 学院
 * history
 * 2015/1/25创建文件
 * 
 */
@Entity
public class College implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*id**/
	private  Integer collegeId;
	/*院系名称**/
	private String name;
	@Id
	@GeneratedValue
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	@Column(length=20,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
