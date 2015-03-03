package org.future.projectManagement.action;

import java.util.List;

import javax.annotation.Resource;

import org.future.projectManagement.bean.College;
import org.future.projectManagement.bean.Project;
import org.future.projectManagement.bean.ProjectType;
import org.future.projectManagement.service.LoginService;
import org.future.projectManagement.service.ProjectService;
import org.future.projectManagement.utils.WhereBuild;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author wanglizheng
 * @date 2015年3月2日
 * @describe 教务处审核人进行项目展示和发布公告
 * 
 */
@Component
@Scope("prototype")
public class ProShowAndPubAnn extends ActionSupport {

	private Integer collegeId = 0;
	private String startTime = "";
	private Integer projectTypeId = 0;
	private Integer projectStatusId = 0;	
	
	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Integer getProjectTypeId() {
		return projectTypeId;
	}
	
	public void setProjectTypeId(Integer projectTypeId) {
		this.projectTypeId = projectTypeId;
	}
	public Integer getProjectStatusId() {
		return projectStatusId;
	}
	
	public void setProjectStatusId(Integer projectStatusId) {
		this.projectStatusId = projectStatusId;
	}

	private ProjectService projectService;	
	private LoginService loginService;
	
	public LoginService getLoginService() {
		return loginService;
	}
	@Resource
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public ProjectService getProjectService() {
		return projectService;
	}
	@Resource
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
		
	public String ColManaUI(){
		return "ListUI";
	}
	// 以下几个页面是为了登陆后显示的，因为是使用framset框架，所以需要使用action进行跳转
	public String index(){
		return "index";
	}
	public String top(){
		return "top";
	}
	public String left(){
		return "left";
	}
	public String right(){
		return "right";
	}
	public String bottom(){
		return "bottom";
	}

	/**
	 * 改变项目的优秀属性，该属性是项目是否展示的标志
	 * 
	 * @param outStanding
	 */
	public String changeOutStanding() {
		
		/*Object[] parameters = {collegeId,startTime,projectTypeId,projectStatusId};
		String where = new WhereBuild().whereBuild(new String[]{"collegeId","startTime","projectTypeId","projectStatusId"});
		System.out.println(where);*/
		// 准备数据
		List<College> collegeList = loginService.findAll(College.class);
		List<ProjectType> projectTypeList = loginService.findAll(ProjectType.class);		
		ActionContext.getContext().put("collegeList", collegeList);
		ActionContext.getContext().put("projectTypeList", projectTypeList);
		
		/*List<Project> projectList = projectService.findBySelect(parameters, where);
		ActionContext.getContext().put("projectList", projectList);
		
		// 测试数据
		for(Project proj : projectList){
			System.out.println(proj.getName());
		}*/
		
		return null;
	}
}