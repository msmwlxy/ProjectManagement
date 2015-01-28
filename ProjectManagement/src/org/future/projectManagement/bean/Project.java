package org.future.projectManagement.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * 项目
 * history
 * 2015/1/25 创建文件
 *
 */
@Entity
public class Project implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/*id**/
	private Integer projectId;
	/*编号**/
	private String number;
	/*名称**/
	private String name;
	/*开始时间**/
	private Date startTime;
	/*结束时间**/
	private Date endTime;
	/*经费**/
	private Float funds;
	/*负责人**/
	private Student principal;
	/*项目组成员**/
	private Set<Student> projectMembers = new HashSet<Student>();
	/*指导老师**/
	private Set<Instructor> instructors = new HashSet<Instructor>();
	/*院系**/
	private College college;
	/*状态**/
	private ProjectStatu projectStatu;
	/*项目日志**/
	private Set<ProjectLog> projectLogs;
	/*简介**/
	private String description;
	/*项目类型**/
	private ProjectType projectType;
	/*是否优秀**/
	private Boolean outstanding;
	/*项目资料**/
	private ProjectData projectData;
	/*构造方法**/
	public Project(String name, Date startTime, Date endTime, Float funds,
			Student principal, Set<Student> projectMembers,
			Set<Instructor> instructors, College college,
			ProjectStatu projectStatu, String description,
			ProjectType projectType) {
	
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.funds = funds;
		this.principal = principal;
		this.projectMembers = projectMembers;
		this.instructors = instructors;
		this.college = college;
		this.projectStatu = projectStatu;
		this.description = description;
		this.projectType = projectType;
	}
	@Id
	@GeneratedValue
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	@Column(length=50)
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Column(length=20,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Column(length=15,nullable=false)
	public Float getFunds() {
		return funds;
	}
	public void setFunds(Float funds) {
		this.funds = funds;
	}
	@ManyToOne
	@JoinColumn(name="plId")
	public Student getPrincipal() {
		return principal;
	}
	public void setPrincipal(Student principal) {
		this.principal = principal;
	}
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "Project_Student", 
	joinColumns = { @JoinColumn(name = "pId", referencedColumnName = "projectId") }, 
	inverseJoinColumns = { @JoinColumn(name = "sId", referencedColumnName = "studentNo") })
	public Set<Student> getProjectMembers() {
		return projectMembers;
	}
	public void setProjectMembers(Set<Student> projectMembers) {
		this.projectMembers = projectMembers;
	}
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "Project_Instructor", 
	joinColumns = { @JoinColumn(name = "pId", referencedColumnName = "projectId") }, 
	inverseJoinColumns = { @JoinColumn(name = "iId", referencedColumnName = "jobNumber") })
	public Set<Instructor> getInstructors() {
		return instructors;
	}
	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
	}
	@ManyToOne
	@JoinColumn(name="cId")
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@ManyToOne
	@JoinColumn(name="psId")
	public ProjectStatu getProjectStatu() {
		return projectStatu;
	}
	public void setProjectStatu(ProjectStatu projectStatu) {
		this.projectStatu = projectStatu;
	}
	@OneToMany(mappedBy="project",cascade=CascadeType.ALL)
	public Set<ProjectLog> getProjectLogs() {
		return projectLogs;
	}
	public void setProjectLogs(Set<ProjectLog> projectLogs) {
		this.projectLogs = projectLogs;
	}
	@Column(length=3000,nullable=false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@ManyToOne
	@JoinColumn(name="ptId")
	public ProjectType getProjectType() {
		return projectType;
	}
	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}
	@Column(nullable=false)
	public Boolean getOutstanding() {
		return outstanding;
	}
	public void setOutstanding(Boolean outstanding) {
		this.outstanding = outstanding;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pdId",unique=true)
	public ProjectData getProjectData() {
		return projectData;
	}
	public void setProjectData(ProjectData projectData) {
		this.projectData = projectData;
	}
	
	
}