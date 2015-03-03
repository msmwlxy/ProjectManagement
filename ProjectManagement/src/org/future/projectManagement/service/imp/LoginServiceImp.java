package org.future.projectManagement.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.future.projectManagement.bean.Admin;
import org.future.projectManagement.bean.ColAudit;
import org.future.projectManagement.bean.Instructor;
import org.future.projectManagement.bean.Student;
import org.future.projectManagement.bean.TAOAudit;
import org.future.projectManagement.dao.LoginDao;
import org.future.projectManagement.service.LoginService;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;

@Component
public class LoginServiceImp implements LoginService {

	private LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}

	/**
	 * 通过Spring容器注入loginDao
	 * 
	 * @param loginDao
	 */
	@Resource
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	/**
	 * 根据用户名和密码进行登陆
	 */
	public boolean findByLoginNameAndPassword(Integer identity,
			String accountNum, String password) {
		// 使用MD5摘要对密码进行加密验证
		/* password = DigestUtils. md5Hex(password); */

		boolean result = false;
		if (identity == 1) {
			Admin admin = loginDao.find(Admin.class, 1);
			if (admin.getPassword().equals(password)
					&& admin.getUserName().equals(accountNum)) {
				// 将获得的对象放入map中，便于页面显示
				ActionContext.getContext().getSession().put("loader", admin);
				//ActionContext.getContext().put("loader", admin);
				result = true;
			}
		} else if (identity == 2) {
			TAOAudit taoAudit = loginDao.find(TAOAudit.class, accountNum);
			if (taoAudit.getPassword().equals(password)) {
				// 将获得的对象放入map中，便于页面显示
				ActionContext.getContext().getSession().put("loader", taoAudit);
				//ActionContext.getContext().put("loader", taoAudit);
				result = true;
			}
		} else if (identity == 3) {
			ColAudit colAudit = loginDao.find(ColAudit.class, accountNum);
			if (colAudit.getPassword().equals(password)) {
				// 将获得的对象放入map中，便于页面显示
				ActionContext.getContext().getSession().put("loader", colAudit);
				//ActionContext.getContext().put("loader", colAudit);
				result = true;
			}
		} else if (identity == 4) {
			Instructor instructor = loginDao.find(Instructor.class, accountNum);
			if (instructor.getPassword().equals(password)) {
				// 将获得的对象放入map中，便于页面显示
				ActionContext.getContext().getSession().put("loader", instructor);
				//ActionContext.getContext().put("loader", instructor);
				result = true;
			}
		} else if (identity == 5) {
			Student student = loginDao.find(Student.class, accountNum);
			System.out.println(student.getName());
			if (student.getPassword().equals(password)) {
				// 将获得的对象放入map中，便于页面显示
				ActionContext.getContext().getSession().put("loader", student);
				//ActionContext.getContext().put("loader", student);
				result = true;
			}
		}
		return result;
	}

	/**
	 * 查询目标Bean的所有记录
	 */
	public <T> List<T> findAll(Class<T> obj) {
		List<T> tList = loginDao.findAll(obj);
		return tList;
	}

	/**
	 * 查询特定Bean的特定记录
	 */
	public <T> T findById(Class<T> obj, Integer id) {
		T r = loginDao.find(obj, id);
		return r;
	}
}