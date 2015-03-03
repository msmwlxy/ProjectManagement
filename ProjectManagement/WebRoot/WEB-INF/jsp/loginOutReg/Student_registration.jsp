<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="${pageContext.request.contextPath }/css/regist_css/registration.css"
	type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="textml; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.signAlign {
	text-align: center;
}
</style>
<script type="text/javascript">
	window.onload = function() {
		var he = window.innerHeight * 0.79;
		alert(window.innerHeight);
		alert(document.getElementById("ri"));
		document.getElementById("ri").style.height = he + "px";
	};
</script>
</head>
<body>
	<div class="header">大学生创新项目管理系统</div>
	<div class="right" id="ri">
		<s:form action="log_signIn" id="log">
			<!-- 隐藏学生注册的确认 -->
			<s:hidden name="identity" value="5"></s:hidden>
			<div class="right_top">
				<div class="xiangji">
					<img
						src="${pageContext.request.contextPath }/images/regist/shangchuan.gif"
						width="25" height="19" />
				</div>
				<div class="wenzi">学生注册</div>
			</div>
			<div class="xiantiao">
				<img src="${pageContext.request.contextPath }/images/xian.png"
					width="840" height="4" />
			</div>

			<div class="identityx">
				<table cellpadding="0" cellspacing="0"
					style="width:370px;margin-left:100px;">
					<tr>
						<td>学号：</td>
						<td><input type="text" name="accountNum" />
						</td>
					</tr>
					<tr>
						<td>姓名：</td>
						<td><input type="text" name="name" />
						</td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="password" name="password" />
						</td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input type="password" name="password2" />
						</td>
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
						<td><s:select theme="simple" name="collegeId" list="#collegeList"
								listKey="collegeId" listValue="name">
							</s:select>
						</td>
					</tr>
					<tr>
						<td>联系电话：</td>
						<td><input type="text" name="telphone" />
						</td>
					</tr>
					<tr>
						<td>电子邮件：</td>
						<td><input type="text" name="email" />
						</td>
					</tr>
					<tr>
						<td><input type="submit" value="注册" /> </td>
						<td><input type="reset" value="重置" /></td>
					</tr>
				</table>
			</div>
			<!-- <div class="chongzhi" style="padding-left:270px;">
				<input type="submit" value="注册" /> <input type="reset" value="重置" />
			</div> -->
		</s:form>
	</div>

	<div class="bottom">
		<a href="#">© 2015 Baidu 使用百度前必读 | 百科协议 | 百度百科合作平台</a>
	</div>
</body>
</html>