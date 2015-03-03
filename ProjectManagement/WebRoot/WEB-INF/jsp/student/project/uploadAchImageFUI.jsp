<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/student/share/taglib.jsp" %>
<%@ include file="/WEB-INF/jsp/student/share/basepath.jsp"  %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="css/uploadThePostProject.css?version=1" type="text/css" rel="stylesheet" />
<link href="css/SpryAccordion.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>上传成果图片的父页面 </title>
</head>
<body>
    <div class="right">
        <table width="800" border="0">
            <tr > 
                <td colspan="2"><img src="images/jiexiang.gif" width="21" height="17" style="margin-left:24px;"/><span style="font-weight:bolder;">上传成果图片</span></td>
            </tr>
            
            <tr><td><div class="xiantiao"><img src="images/xian.png" width="846" height="4"/></div></td></tr>
            <core:forEach items="${projects.results }" var="project">
            <tr class="text_font">
                <td><div class="hs" style="margin-left:30px;">${project.name}</div></td>
                <td><a href="student/uploadAchImageUI?projectId=${project.projectId }" style="margin-left:-100px;">上传</a>&nbsp;<img src="images/2.png" height="10"/></td>
            </tr>
             <tr><td><div class="xuxian"></div></td></tr>
			</core:forEach>
        </table>
    </div>	
</body>
</html>	