package org.future.projectManagement.action;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
@Component
public class CenterAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute(){
		return "success";
	}
}
