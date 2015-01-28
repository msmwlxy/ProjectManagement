package org.future.projectManagement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * 项目类型
 * history
 * 2015/1/25 创建文件
 */
@Entity
public class ProjectType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*项目类型**/
	private Integer projectTypeId;
	/*类型名称**/
	private String name;
	@Id
	@GeneratedValue
	public Integer getProjectTypeId() {
		return projectTypeId;
	}
	public void setProjectTypeId(Integer projectTypeId) {
		this.projectTypeId = projectTypeId;
	}
	@Column(length=15,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
