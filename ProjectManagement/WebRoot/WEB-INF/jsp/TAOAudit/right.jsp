<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link  href='${pageContext.request.contextPath }/css/ColAudit/ipms.css' type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看申报的项目</title>
</head>
<body>	
	<div id="mid_right">
		<s:debug></s:debug>
	欢迎您，${loader.name }进入后台！
	<br />
	<s:a action="log_logOut">退出</s:a>
	</div>		
</body>
</html>