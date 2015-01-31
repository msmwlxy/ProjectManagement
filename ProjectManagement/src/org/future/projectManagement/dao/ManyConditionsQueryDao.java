package org.future.projectManagement.dao;

import java.util.Date;
import java.util.List;

public interface ManyConditionsQueryDao {
	/**
	 * 方法作用：得到要查询的记录个数
	 * @param cId ：院系  
	 * @param startTime ：开始时间
	 * @param endTime ： 结束时间
	 * @param iId ：指导老师
	 * @param psId ： 状态
	 * @param outStanding ：是否优秀
	 * 以上参数都是查询条件
	 * @return ：得到要查询的记录个数
	 */
	public int getCount(int cId, Date startTime, Date endTime, int iId, int psId, Boolean outStanding);  
	  
	/**
	 * 方法作用：得到要查询的记录
	 * @param cId
	 * @param startTime
	 * @param endTime
	 * @param iId
	 * @param psId
	 * @param outStanding
	 * @param maxRow : 每页最多显示多少条记录 （先不写，回头再写）
	 * @param currentPage : 当前页 (先不谢，回头再写)
	 * 做适当的处理，将以上属性转化为相应实体的属性
	 * @return ：查询的记录
	 */
	public List<?> search(int cId, Date startTime, Date endTime, int iId, int psId, Boolean outStanding, int maxRow, int currentPage);
	/**
	 * 功能：将返回一个hql中条件（也就是where）后边的部分 hql
	 * 参数：list l 的定义是将用到的参数（也就是对应hql中 ？ 的参数）保存起来：list保存的是用户查询时也设置的参数
	 * @param l
	 * @param cId
	 * @param startTime
	 * @param endTime
	 * @param iId
	 * @param psId
	 * @param outStanding
	 * @return
	 */
	public String getHQL(List<Object> l, int cId, Date startTime, Date endTime,
			int iId, int psId, Boolean outStanding); 
	
}
