<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/student/share/taglib.jsp" %>
<%@ include file="/WEB-INF/jsp/student/share/basepath.jsp"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<link href="css/detailView.css?ver=1" type="text/css" rel="stylesheet" />
<link href="css/SpryAccordion.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看申报的项目</title>
	<script src="js/SpryAccordion.js" type="text/javascript"></script>
</head>
<body>
	<div id="header">
    	<font>大学生创新项目管理系统</font>
    </div>
    	<span class="title">查看项目详细信息</span>
        <div class="main">
            <div class="top_zuo"> 
                <ul type="none">
                      <li><font>项目名称</font>&nbsp;&nbsp;&nbsp;&nbsp;<input name="name" type="text" size="28" maxlength="28" value="${project.name }" style="text-align: center;"   disabled/></li>
                      <li><font>申请总经费</font>&nbsp;&nbsp;<input name="name" type="text" size="28" maxlength="28" value="${project.funds }" style="text-align: center;"   disabled/></li>
                      <li><font>项目类型</font>&nbsp;&nbsp;&nbsp;&nbsp;<input name="name" type="text" size="28" maxlength="28" value="${project.projectType.name }" style="text-align: center;"   disabled/></li>
                </ul>
            </div>
            <div class="top_you">
                <ul type="none">
                      <li><font>负责人</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="name" type="text" size="28" maxlength="28" value="${project.principal.name }" style="text-align: center;"   disabled/></li>
                      <li><font>所属院系</font>&nbsp;&nbsp;&nbsp;&nbsp;<input name="name" type="text" size="28" maxlength="28" value="${project.college.name }" style="text-align: center;"   disabled/></li>
                      <li><font>状态</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="name" type="text" size="28" maxlength="28" value="${project.projectStatu.name }" style="text-align: center;"   disabled/></li>
                </ul>
            </div>
            <div class="xuxian"></div>
                <div class="mid_chy">
                    <div class="chengyuan">
                        <font>项目组成员</font>&nbsp;
                        <table>
                        <core:forEach items="${project.projectMembers }" var="student">
                        <tr>
                        <input name="name" type="text" size="15" maxlength="15" value="${student.name }" style="text-align: center;"   disabled />
                       	 </tr>&nbsp;&nbsp;&nbsp;
                        </core:forEach>
                        </table>
                    </div>
                    <div class="laoshi">
                   
                      <font>&nbsp;指导老师</font>&nbsp;&nbsp;&nbsp;
                      <table>
                      <core:forEach items="${project.instructors }" var="instructor">
                      		<tr>
                      <input name="name" type="text" size="15" value="${instructor.name }" maxlength="15" style="text-align: center;"   disabled/>
                     		</tr>&nbsp;&nbsp;&nbsp;
                     	</core:forEach>
                      </table>
                    </div>
                </div>
                <div class="xuxian"></div>
                <div class="bot_jianjie">
                    <font>项目简介</font>&nbsp;&nbsp;&nbsp;&nbsp;
                </div>
               <div id="description">${project.description}</div> 
                <div class="button">
                    <input type="button" onclick="javascript:window.location.href='student/lookReportProjectUI'" style="width:100px;margin-left:400px;" value="返回"/>
                </div>
        </div> 		
</body>
</html>
