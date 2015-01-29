package org.future.projectManagement.action;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.future.projectManagement.bean.College;
import org.future.projectManagement.bean.Instructor;
import org.future.projectManagement.bean.Project;
import org.future.projectManagement.bean.ProjectAndPage;
import org.future.projectManagement.bean.ProjectStatu;
import org.future.projectManagement.bean.ProjectType;
import org.future.projectManagement.bean.Student;
import org.future.projectManagement.service.ProjectService;
import org.future.projectManagement.service.StudentService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Component
@Scope("prototype")
public class StudentAction extends ActionSupport implements ModelDriven<ProjectAndPage<Project>>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*学号**/
	private String studentNo;
	/*姓名**/
	private String name;
	/*年级**/
	private String grade;
	/*电话**/
	private String phone;
	/*邮箱**/
	private String email;
	/*学院id**/
	private Integer collegeId;
	/*登陆密码**/
	private String password;
	/*用于封装浏览器传过来的request参数，此外还为分页提供方便**/
	private ProjectAndPage<Project> pp = new ProjectAndPage<Project>();
	
	private StudentService studentService;
	private ProjectService projectService;
	
	
	public StudentService getStudentService() {
		return studentService;
	}
	@Resource
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public ProjectService getProjectService() {
		return projectService;
	}
	@Resource
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ProjectAndPage<Project> getPp() {
		return pp;
	}

	public void setPp(ProjectAndPage<Project> pp) {
		this.pp = pp;
	}

	/*申报项目**/
	public String reportProject(){
		
		Student principal = new Student();
		principal.setStudentNo(this.pp.getPrincipalId());
		
		Set<Student> projectMembers = new HashSet<Student>();
		
		for(String sId:this.pp.getProjectMemberIds()){
			Student member = new Student();
			member.setStudentNo(sId);
			
			projectMembers.add(member);
		}
		
		Set<Instructor> instructors = new HashSet<Instructor>();
		
		for(String iId:this.pp.getInstructors()){
			Instructor instructor = new Instructor();
			instructor.setJobNumber(iId);
			
			instructors.add(instructor);
		}
		
		College college = new College();
		college.setCollegeId(this.pp.getCollegeId());
		
		ProjectStatu projectStatu = new ProjectStatu();
		projectStatu.setProjectStatuId(2);
		
		ProjectType projectType = new ProjectType();
		projectType.setProjectTypeId(1);
		
		Project project = new Project(pp.getDescription(),
									pp.getStartTime(), 
									pp.getEndTime(), 
									pp.getFunds(),
									principal, 
									projectMembers,
									instructors,
									college,
									projectStatu,
									pp.getDescription(),
									projectType);
		
		projectService.add(project);
		return "message";
	}

	@Override
	public ProjectAndPage<Project> getModel() {
		
		return this.pp;
	}
}
