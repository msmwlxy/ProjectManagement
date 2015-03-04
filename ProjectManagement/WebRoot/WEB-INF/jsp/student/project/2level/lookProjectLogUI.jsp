<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/student/share/taglib.jsp" %>
<%@ include file="/WEB-INF/jsp/student/share/basepath.jsp"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="css/checkProject.css" type="text/css" rel="stylesheet" />
<link href="css/SpryAccordion.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="js/JqueryWin.js"></script>

<script type="text/javascript" src="js/paging.js"></script>
<link type="text/css" rel="stylesheet" href="css/win.css">
	<title>查看项目审核日志详细信息</title>

</head>
<body>
	  <div class="right">
	  <form action="student/lookProjectLogUI" method="post">
	  <input type="hidden" name="projectId" value="${pp.projectId }"/>
	  <input type="hidden" name="currentPage">
        <table width="800" border="0" style="line-height:25px;">
            <tr style="font-size:18px; color:#000; font-weight:bolder;"> 
                <td colspan="2"><img src="images/xiugai.png" width="23" height="19" style="margin-left:24px;" >查看项目审核日志详细信息(${ project.name})</td>
            </tr>
            <tr>
            	<td>    
                	<img src="images/xian.png" width="800" height="4">
                </td>
            </tr>
           <tr><td align="center"><core:if test="${empty pp.qr.results }">暂无审核日志信息</core:if></td> </tr>
           <core:forEach items="${pp.qr.results }" var="proLog">
	            <tr class="text_font" >
	                <td ><label style="margin-left:30px;">
${proLog.time.year+1900 }年${proLog.time.month }月${proLog.time.day}日<font color="black">${proLog.operatorName }</font>将此创新项目置为<font color="black">${proLog.project.projectStatu.name }</font></label></td>
	                <td ><label 
	               onclick="showwin(event,'${proLog.opinion }')" 
	               style="margin-left:-180px;" >左击鼠标查看审核意见</label></td>
	            </tr>
         	</core:forEach>
         
        </table>
        </form>
      <core:if test="${!empty pp.qr.results }"> <div style="text-align: center;"><%@include file="/WEB-INF/jsp/student/share/paging.jsp" %></div> </core:if>
        
	
    </div>	
	<div id="win">
   <div id="title">&nbsp;意见	<label onclick="closewin()" style="margin-left: 210px;font-size: 6px" >关闭</label></div>
   <div id="cont" >我是一个窗口</div>
   </div>
  <br>
</body>
</html>
