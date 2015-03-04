package org.future.projectManagement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * 项目状态
 * history
 * 2015/1/25 创建文件
 * 2015/2/9  增加tagNo属性
 */
@Entity
public class ProjectStatu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*id**/
	private Integer projectStatuId;
	/*状态名称**/
	private String name;
	/*不通过状态的标记**/
	private boolean tagNo;
	@Id
	@GeneratedValue
	public Integer getProjectStatuId() {
		return projectStatuId;
	}
	public void setProjectStatuId(Integer projectStatuId) {
		this.projectStatuId = projectStatuId;
	}
	@Column(length=20,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTagNo() {
		return tagNo;
	}
	public void setTagNo(boolean tagNo) {
		this.tagNo = tagNo;
	}
	
}
