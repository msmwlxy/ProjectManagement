package org.future.projectManagement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * 职位/职称
 * history
 * 2015/1/25 创建文件
 */
@Entity
public class Position implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*id**/
	private	Integer positionId;
	/*职称/名称**/
	private String name;
	@Id
	@GeneratedValue
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	@Column(length=20,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
