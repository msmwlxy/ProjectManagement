<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/student/share/taglib.jsp" %>
<%@ include file="/WEB-INF/jsp/student/share/basepath.jsp"  %>

<html>
<head>
<title>大学生创新项目管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
	<frameset rows="100,*,30" noresize framespacing="0" border="0">
		
		<frame src="student/top" noresize scrolling="no">
		
		<frameset cols="262,*" noresize>
        	<frame src="student/left" name = "left" noresize scrolling="no" >
            <frame src="student/right" name = "right" noresize scrolling="auto" >
		</frameset>
		<frame src="student/bottom" scrolling="no" noresize >
	</frameset>
<body>
</html>
</body>
