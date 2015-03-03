<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<link href="${pageContext.request.contextPath }/css/ColAudit/ShowManage.css"
	type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>项目展示管理</title>
<script language="javascript"
	src="${pageContext.request.contextPath }/js/jquery.js"></script>
</head>

<body>
	<div class="right">
		<!-- 显示表单数据（查询条件） -->
		<s:form action="manyConditions_searchByManyConditions">
			<s:hidden name="roleId" value="2"></s:hidden>
			<table width="1000" border="0">
				<tr style="padding-top:50px;">
					<td colspan="5">
						<div class="condition" style="text-align:left;">
							<img
								src="${pageContext.request.contextPath }/images/ColAudit/research_condi.gif">查询条件
							<span id="office">院系</span>
						</div>
						<div id="xian">
							<img src="${pageContext.request.contextPath }/images/xian.png"
								width="1010" height="3">
						</div>
					</td>
				</tr>
				<tr class="sele_box" style="line-height:25px; text-align:left;">
					<td width="25%"><font>申报年份：</font> <s:select theme="simple"
							style="width:105px; height:20px; font-size:12px; margin-left:5px;"
							name="startTime" list="" listKey="" listVaule=""
							headerKey="0" headerVaule="------ ">
						</s:select>
					</td>

					<td width="20%"><font>项目类型：</font> <s:select theme="simple"
							name="ptId" list="#QRAllProjectType" listKey="projectTypeId"
							listValue="name" headerKey="" headerValue="------" />
					</td>
					 <td>
                    	<font>是否优秀：</font>
                        <select name="">
                          <option value ="0">一般</option>
                          <option value ="1">优秀</option>
                        </select>
                      </td>
				</tr>
				<tr>
					<td colspan="5"><div class="xuxian"></div></td>
				</tr>
				<tr>
					<td colspan="5"><input type="submit"
						style="width:65px;margin-left:840px; margin-top:20px;" value="查询" />
					</td>
				</tr>
			</table>
		</s:form>

		<table width="1000" border="0"
			style="text-align:center; line-height:25px;">
			<tr style="padding-top:40px;">
				<td colspan="10">
					<div class="result" style="text-align:left;">
						<img
							src="${pageContext.request.contextPath }/images/ColAudit/research_result.gif">查询结果
					</div>
					<div id="xian">
						<img src="${pageContext.request.contextPath }/images/ColAudit/b_xian.png"
							width="1010" height="3">
					</div>
				</td>
			</tr>
			<tr class="title">
				<td>院系</td>
				<td>编号</td>
				<td>项目名</td>
				<td>是否展示</td>
			</tr>
			<tr>
				<td colspan="10">
					<div class="xuxian"></div>
				</td>
			</tr>
			<!-- 查询结果  -->
			<s:iterator value="recordList">
				<tr class="content">
					<td>信息工程学院</td>
					<td>201515385</td>
					<td>计算机未来发展</td>
					<td><input type="checkbox" value="0"></td>
				</tr>
				<tr>
					<td colspan="10">
						<div class="xuxian"></div>
					</td>
				</tr>
			</s:iterator>
			<tr>
				<td colspan="10"></td>
			</tr>
		</table>
		<div class="page">
			<p align="center">
				页次：${currentPage }/${pageCount }页 &nbsp; 每页显示：${pageSize }条 &nbsp;
				总记录数：${recordCount }条 <a href="javascript:gotoPage(1)" title="首页"
					style="cursor: hand;"> 首页</a>
				<s:iterator begin="%{beginPageIndex }" end="%{endPageIndex}"
					var="num">
					<s:if test="#num != 0">
						<s:if test="#num == currentPage">
							<%-- 当前页 --%>
							<span style="color:red;">${num}&nbsp;</span>
						</s:if>
						<s:else>
							<%-- 非当前页 --%>
							<span style="cursor: hand;" onClick="gotoPage(${num});">${num}</span>
						</s:else>
					</s:if>
				</s:iterator>
				<a href="javascript:gotoPage(${pageCount })" title="尾页"
					style="cursor: hand;"> 尾页</a> 转到： <select
					onchange="gotoPage(this.value)" id="_pn">
					<s:iterator begin="1" end="%{pageCount}" var="n">
						<option value="${n}">${n}&nbsp;</option>
					</s:iterator>
				</select>
				<script type="text/javascript">
					$("#_pn").val("${currentPage}");
				</script>
			</p>
		</div>
	</div>
	<!-- <script type="text/javascript">
		function gotoPage(pageNum){window.location.href = "manyConditions_searchByManyConditions.action?reportYear=${reportYear}&iId=${iId}&ptId=${ptId}&psId=${psId}&outStanding=${outStanding}&roleId=${roleId}&pageNum=" + pageNum; }
	</script>-->

</body>
</html>
