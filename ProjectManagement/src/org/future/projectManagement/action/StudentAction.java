package org.future.projectManagement.action;

import org.future.projectManagement.bean.Project;
import org.future.projectManagement.bean.ProjectAndPage;
import org.future.projectManagement.bean.Student;
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
	
	private ProjectAndPage<Project> pp = new ProjectAndPage<Project>();
	
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
		return "message";
	}

	@Override
	public ProjectAndPage<Project> getModel() {
		
		return this.pp;
	}
}
