<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<font color="#FFFFFF">
<font color="#336633">当前第${pp.currentPage }页  | 共${pp.endPageIndex }页 | 共${pp.qr.totalResults}条记录  | 每页显示${pp.pageMaxResult}条记录 |</font> 
	
    <core:forEach begin="${pp.startPageIndex}" end="${pp.endPageIndex }" var="index">
    	
    	<core:if test="${pp.currentPage==index}">
    		<a href="javascript:toPage('${index }')">
    		<b>
    		<font color="#336633"> 第${index}页</font>
    		</b>
    		</a> 
    	</core:if>
    	
    	<core:if test="${pp.currentPage!=index}">
    			<a href="javascript:toPage('${index }')">
    			<font color="#336633"> 第${index}页</font>
    			</a>
    	</core:if>
    			
    </core:forEach> 
    