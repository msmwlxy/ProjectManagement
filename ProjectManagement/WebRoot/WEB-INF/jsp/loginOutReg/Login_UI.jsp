<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'Log_InOut.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
#login_out {
	width: 300px;
	height: 300px;
	border: 1px solid red;
}

#xian {
	margin-top: -10px;
}

#xian img {
	width: 300px;
	height: 6px;
}

#login {
	width: 260px;
	height: 30px;
	background: url(yi.png) no-repeat;
	background-position: 16px 3px;
	line-height: 30px;
	padding-left: 40px;
}

#name {
	text-align: center;
}
</style>
</head>

<body>
	<div id="login_out">
		<div id="login">登陆</div>
		<div id="xian">
			<img src="xian.png" />
		</div>
		<div>
			<div id="name">用户登陆</div>
			<form action="log_login" style="padding:10px 10px; ">
				身份： <select name="identity">
					<option value="0" selected="selected">请选择登陆身份</option>
					<option value="1">管理员</option>
					<option value="2">教务处审核人</option>
					<option value="3">院系审核人</option>
					<option value="4">指导老师</option>
					<option value="5">学生</option>
				</select><br /> 账号： <input name="accountNum" type="text" value="请输入您的账号"
					style="color:gray;" /><br /> 密码： <input name="password"
					type="password" /><br /> <input type="submit" value="登陆" /> <input
					type="button" value="注册" />
			</form>

		</div>
	</div>
</body>
</html>





















