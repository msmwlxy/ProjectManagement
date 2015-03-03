<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.signAlign {
	text-align: center;
}
</style>
</head>
<body>
	<%--<s:debug></s:debug>
	注册页面 ！！！
	--%>
	<s:form action="log_signIn" style="margin:0 auto;" id="log">
		<p style="border-bottom:1px dashed gray;" class="signAlign">学生注册页面</p>
		<!-- 隐藏学生注册 -->
		<s:hidden name="identity" value="5"></s:hidden>
		<div id="identityx">
			<table cellpadding="0" cellspacing="0">
				<tr>
					<td width="100">学号：</td>
					<td><input type="text" name="accountNum" />
					</td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="name" />
					</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input type="password" name="password2" /></td>
				</tr>
				<tr>
					<td>入学年份：</td>
					<td><select name="grade">
							<option value="2009">2009</option>
							<option value="2010">2010</option>
							<option value="2011">2011</option>
							<option value="2012">2012</option>
							<option value="2013">2013</option>
							<option value="2014">2014</option>
							<option value="2015">2015</option>
					</select> 年</td>
				</tr>
				<tr>
					<td>院系：</td>
					<td><s:select name="collegeId" list="#collegeList"
							listKey="collegeId" listValue="name">
						</s:select></td>
				</tr>
				<tr>
					<td>联系电话：</td>
					<td><input type="text" name="telphone" /></td>
				</tr>
				<tr>
					<td>电子邮件：</td>
					<td><input type="text" name="email" /></td>
				</tr>
			</table>
		</div>
		<input class="signAlign" type="submit" value="注册" />
		<input class="signAlign" type="reset" value="重置" />
	</s:form>

</body>
</html>