<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link
	href="${pageContext.request.contextPath }/css/regist_css/registration.css"
	type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>The_teacher_registration</title>
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
	<div id="ri" class="right">
		<div class="right_top">
			<div class="xiangji">
				<img
					src="${pageContext.request.contextPath }/images/regist/shangchuan.gif"
					width="25" height="19" />
			</div>
			<div class="wenzi">教师注册</div>
		</div>
		<div class="xiantiao">
			<img src="${pageContext.request.contextPath }/images/xian.png"
				width="840px" height="4" />
		</div>
		<s:form action="log_signIn">
			<!-- 隐藏教师注册标志 -->
			<s:hidden name="identity" value="4"></s:hidden>
			<div class="identityx">
				<table cellpadding="0" cellspacing="0"
					style="width:370px;margin-left:100px;">
					<tr>
						<td>工号：</td>
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
						<td><input type="password" name="password" />
						</td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input type="password" name="password2" />
						</td>
					</tr>
					<tr>
						<td>职位：</td>
						<td><s:select name="positionId" list="#positionList"
								listKey="positionId" listValue="name">
							</s:select>
						</td>
					</tr>
					<tr>
						<td>院系：</td>
						<td><s:select name="collegeId" list="#collegeList"
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
				</table>
			</div>
			<div class="chongzhi" style="padding-left:270px">
				<input class="signAlign" type="submit" value="注册" /> <input
					class="signAlign" type="reset" value="重置" />
			</div>
		</s:form>
		<div style="clear:both;"></div>
	</div>	
	<bottom>
	<div class="bottom">
		<a href="#">© 2015 Baidu 使用百度前必读 | 百科协议 | 百度百科合作平台</a>
	</div>
	</bottom>
</body>
</html>