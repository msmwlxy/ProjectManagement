<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh"
	content="3; url=${pageContext.request.contextPath }/index.jsp">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	您已经退出该系统，如果3秒内没有跳转，请点击
	<a href="${pageContext.request.contextPath }/log_index.action">该处</a>进行跳转！！！
</body>
</html>