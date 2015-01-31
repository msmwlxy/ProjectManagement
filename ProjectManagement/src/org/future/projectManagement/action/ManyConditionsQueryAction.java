package org.future.projectManagement.action;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Project;
import org.future.projectManagement.service.ManyConditionsQueryService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 多条件查询（汇总查询）
 * @author Administrator-HZC
 *
 */

@Controller
@Scope("prototype")
public class ManyConditionsQueryAction extends ActionSupport implements
		ModelDriven<Project> {

	@Override
	public Project getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Resource
	private ManyConditionsQueryService manyConditionsQueryService;
	
	/**
	 * 多条件查询（汇总查询）
	 */
	public String SearchByManyConditions() throws Exception{
		
		return "search";
	}
	
}