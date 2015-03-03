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
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery.js"></script>

</head>
<body>
	<%--<s:debug></s:debug>
	注册页面 ！！！
	--%>
	<s:form action="log_signIn" style="margin:0 auto;" id="log">
		<p style="border-bottom:1px dashed gray;" class="signAlign">指导老师注册页面</p>
		<!-- 隐藏学生注册 -->
		<s:hidden name="identity" value="4"></s:hidden>
		<div id="identity">
			<table cellpadding="0" cellspacing="0">
				<tr>
					<td width="100">工号：</td>
					<td><input type="text" name="accountNum"
						onblur="isNumber(this)" /> <span id="accountNumError"></span><br />
						<span>*工号仅由数字组成</span>
					</td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="name"
						onblur="isChineseChar(this)" /><span id="nameError"></span> <br />
						<span>*姓名仅由汉字组成</span>
					</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password" id="passworda"
						onblur="isPassword(this)" /><span id="password1"></span>
					</td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input type="password" name="password2"
						onblur="isEquals()" id="passwordb" /> <span id="password2"></span><br />
						<span>*密码由字母或数字组成</span>
					</td>
				</tr>
				<tr>
					<td>职位：</td>
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
					<td><input type="text" name="telphone" /> <span id="phoneNum"></span>
					</td>
				</tr>
				<tr>
					<td>电子邮件：</td>
					<td><input type="text" name="email" /> <span id="emailError"></span>
					</td>
				</tr>
			</table>
		</div>
		<input class="signAlign" type="submit" value="注册" />
		<input class="signAlign" type="reset" value="重置" />
	</s:form>
	<script type="text/javascript">
		// 用户名校验（只能是汉字）
		function isChineseChar(c) {
			var reg = /[\u4E00-\u9FA5]/; // 定义正则表达式
			if (reg.test(c.value)) {
				$("#nameError").text("");
				$("#nameError").append("<font color='green'>*</font>");
				return true;
			} else {
				$("#nameError").text("");
				$("#nameError")
						.append("<font color='red'>* 用户名为空或格式错误！</font>");
				return false;
			}
		}
		// 邮箱校验
		function checkEmail(strEmail) {
			//var emailReg = /^[_a-z0-9]+@([_a-z0-9]+\.)+[a-z0-9]{2,3}$/; 
			var emailReg = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;

			if (emailReg.test(strEmail.value)) {
				$("#emailError").text("");
				$("#emailError").append("<font color='green'>*</font>");
				return true;
			} else {
				$("#emailError").text("");
				$("#emailError").append(
						"<font color='red'>*您输入的Email地址为空或格式不正确！</font>");
				return false;
			}
		}
		//联系电话校验
		function checkPhone(strPhone) {
			var mobilePhone = /^1[3|4|5|8][0-9]\d{4,8}$/;

			if (strPhone.length > 9) {
				if (mobilePhone.test(strPhone.value)) {
					$("#phoneNum").text("");
					$("#phoneNum").append("<font color='green'>*</font>");
					return true;
				} else {
					$("#phoneNum").text("");
					$("#phoneNum").append(
							"<font color='red'>*您输入的电话号码为空或不正确！</font>");
					return false;
				}
			}
		}
		//密码验证
		function isPassword(s) {//判断是否是数字或字母 
			var regu = "^[0-9a-zA-Z]+$";
			var re = new RegExp(regu);
			if (re.test(s.value)) {
				$("#password1").text("");
				$("#password1").append("<font color='green'>*</font>");
			} else {
				$("#password1").text("");
				$("#password1").append("<font color='red'>*密码不合法！</font>");
			}
		}
		function isEquals() {
			if ($("#passworda").val() != $("#passwordb").val()) {
				$("#password2").text("");
				$("#password2").append("<font color='red'>*前后密码不一致！</font>");
				return false;
			} else {
				$("#password2").text("");
				$("#password2").append("<font color='green'>*</font>");
				return true;
			}
		}
		// 学号/工号验证
		function isNumber(s) {//判断是否是数字或字母 
			var regu = "^[0-9]+$";
			var re = new RegExp(regu);
			if (re.test(s.value)) {
				$("#accountNumError").text("");
				$("#accountNumError").append("<font color='green'>*</font>");
			} else {
				$("#accountNumError").text("");
				$("#accountNumError").append(
						"<font color='red'>*学/工号为空或格式错误！</font>");
			}
		}
	</script>
</body>
</html>