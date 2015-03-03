package org.future.projectManagement.action;

import java.util.List;

import javax.annotation.Resource;

import org.future.projectManagement.bean.College;
import org.future.projectManagement.bean.Instructor;
import org.future.projectManagement.bean.Position;
import org.future.projectManagement.bean.Student;
import org.future.projectManagement.service.InstructorService;
import org.future.projectManagement.service.LoginService;
import org.future.projectManagement.service.StudentService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 登陆相关Action
 * 
 * @author wanglizheng
 * 
 */
@Component
@Scope("prototype")
public class LoginAction extends ActionSupport {

	// 身份选择信息
	private Integer identity;
	// 用户的学/工号和超级管理员的userName
	private String accountNum;
	private String password;
	private String password2;
	private String name;
	private String telphone;
	private String email;

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	// 学生入学年份
	private String grade;
	// 所属院系
	private Integer collegeId;

	// 指导老师的职位
	private Integer positionId;

	// 注入loginService服务接口
	private LoginService loginService;
	private StudentService studentService;
	private InstructorService instructorService;

	public InstructorService getInstructorService() {
		return instructorService;
	}

	@Resource
	public void setInstructorService(InstructorService instructorService) {
		this.instructorService = instructorService;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	@Resource
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	@Resource
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 登陆界面
	 * 
	 * @return
	 */
	public String loginUI() {
		return "loginUI";
	}

	/**
	 * 登陆操作
	 * 
	 * @return
	 */
	public String login() {
		if (identity != 1 && identity != 2 && identity != 3 && identity != 4
				&& identity != 5) {
			// 提示用户错误信息
			addFieldError("error", "请选择正确的身份认证！！！");
			return "index";
		} else {
			boolean result = loginService.findByLoginNameAndPassword(identity,
					accountNum, password);
			if (result) {
				if(identity == 1){
					return "login_Admin";
				}else if(identity == 2){
					return "login_TAOAudit";
				}else if(identity == 3){
					return "login_ColAudit";
				}else if(identity == 4){
					return "login_Instructor";
				}else{
					return "login_Student";
				}
			} else {
				addFieldError("error", "用户名或密码错误！！！");
				return "index";
			}
		}
	}

	/**
	 * 注册界面
	 * 
	 * @return
	 */
	public String signInUI() {
		// 准备显示数据指导老师position和院系college，放入map中进行页面显示
		// 判断是否是指导老师，进行职位查询
		if (identity == 4) {
			List<Position> positionList = loginService.findAll(Position.class);
			ActionContext.getContext().put("positionList", positionList);
		}
		List<College> collegeList = loginService.findAll(College.class);
		ActionContext.getContext().put("collegeList", collegeList);
		if (identity == 5) {
			return "signInUIS";
		} else if (identity == 4) {
			return "signInUII";
		} else {
			return "index";
		}
	}

	/**
	 * 注册操作
	 * 
	 * @return
	 */
	public String signIn() {
		if (identity == 4) {
			// 如果已经存在该指导老师，就返回提示
			if (instructorService.find(Instructor.class, accountNum) != null) {
				addFieldError("errorMessage", "该用户已经存在！！！");
				return "signInUII";
			} else {
				Instructor instructor = new Instructor();
				instructor.setCollege(loginService.findById(College.class,
						collegeId));
				instructor.setEmail(email);
				instructor.setJobNumber(accountNum);
				instructor.setName(name);

				// TODO 注册密码加密保存

				// String passwordNew = DigestUtils.md5Hex(password);

				instructor.setPassword(password);
				instructor.setPosition(loginService.findById(Position.class,
						positionId));
				instructor.setTelphone(telphone);
				// FIXME 缺少一个指导老师的注册保存操作
				instructorService.add(instructor);
			}
		} else if (identity == 5) {
			if (studentService.find(Student.class, accountNum) != null) {
				addFieldError("errorMessage", "该用户已经存在！！！");
				return "signInUIS";
			} else {
				Student student = new Student();
				student.setCollege(loginService.findById(College.class,
						collegeId));
				student.setEmail(email);
				student.setGrade(grade);
				student.setName(name);
				// TODO 注册密码加密保存

				// String passwordNew = DigestUtils.md5Hex(password);

				student.setPassword(password);
				student.setStudentNo(accountNum);
				student.setTelphone(telphone);
				studentService.add(student);
			}
		} else {
			// 如果在地址栏中直接输入未知，就跳转到首页
			return "index";
		}
		return "signIn";
	}

	/**
	 * 退出操作
	 * 
	 * @return
	 */
	public String logOut() {
		// 用户注销，将会话从session中移除
		// 先对用户进行判断，防止退出后继续退出
		if (ActionContext.getContext().get("loader") != null) {
			ActionContext.getContext().getSession().remove("loader");
		}else{
			addFieldError("erroe", "用户已经退出！！！");
		}
		return "logOut";
	}

}