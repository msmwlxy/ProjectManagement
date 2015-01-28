package org.future.projectManagement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * 校内公告
 * history
 * 2015/1/25 创建文件
 */
@Entity
public class SchoolBulletin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*id**/
	private Integer	schoolBulletinId;
	/*标题**/
	private String title;
	/*内容**/
	private String cont;
	/*置顶**/
	private Boolean stick;
	/*附件名**/
	private	String appendixName;
	/*发表人**/
	private TAOAudit taoAudit;
	@Id
	@GeneratedValue
	public Integer getSchoolBulletinId() {
		return schoolBulletinId;
	}
	public void setSchoolBulletinId(Integer schoolBulletinId) {
		this.schoolBulletinId = schoolBulletinId;
	}
	@Column(length=35,nullable=false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(length=15000)
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	@Column(nullable=false)
	public Boolean getStick() {
		return stick;
	}
	public void setStick(Boolean stick) {
		this.stick = stick;
	}
	@Column(length=35)
	public String getAppendixName() {
		return appendixName;
	}
	public void setAppendixName(String appendixName) {
		this.appendixName = appendixName;
	}
	@ManyToOne
	@JoinColumn(name="taId")
	public TAOAudit getTaoAudit() {
		return taoAudit;
	}
	public void setTaoAudit(TAOAudit taoAudit) {
		this.taoAudit = taoAudit;
	}
	
}
