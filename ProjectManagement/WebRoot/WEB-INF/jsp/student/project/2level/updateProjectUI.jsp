<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/student/share/taglib.jsp" %>
<%@ include file="/WEB-INF/jsp/student/share/basepath.jsp"  %>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache"/>
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"/>
<META HTTP-EQUIV="Expires" CONTENT="0"/> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/updateIforma.css?version=1" type="text/css" rel="stylesheet" />
<link type="text/css" rel="stylesheet" href="css/calendar.css" />
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="js/calendar.js" ></script>  
<script type="text/javascript" src="js/calendar-zh.js" ></script>
<script type="text/javascript" src="js/calendar-setup.js"></script>
<script type="text/javascript" src="js/projectAddOrUpdate.js"></script>
<script type="text/javascript" charset="utf-8" src="richTextarea/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="richTextarea/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="richTextarea/lang/zh-cn/zh-cn.js"></script>


          
<script type="text/javascript">
//textarea不在document的ready范围之内，所以需要加上此段程序	
	$(document).ready(function(){
		
		setTimeout("setContent()",100); 
		
	});</script>

<title>修改项目申报</title>
</head>
<body>	
	  <div class="right">
        <div class="right_top">
          <div class="xiangji">
           <img src="images/View_detailed.gif" width="21" height="19"/>
          </div>
         <div class="wenzi">
            修改项目详细信息
         </div> 
        </div>
        <div class="xiantiao"><img src="images/xian.png" width="846" height="4" />
        </div>
        
       
       <input type="hidden" id="projectId" value="${pp.projectId }"/>
	<div class="sanjiao">
        
       <span>项目名称:</span>
        <input style="border:solid #1E5DBA 1px;" type="text" value="${pp.name }" name="name" id="name"/>
        <span>申请总经费:</span>
        <input style="border:solid #1E5DBA 1px;" type="text" value="${pp.funds }" name="funds" id="funds"/></p>
       
        <p><span>所属院系:</span>
                <select name="collegeId" id="collegeId" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:200px;">  
                  	<core:forEach items="${colleges}" var="college">
                  		<core:if test="${pp.collegeId==college.key}">
                  		<option value="${college.key }" selected>${college.value }</option>
                  		</core:if>
                  		<core:if test="${pp.collegeId!=college.key }">
                  		<option value="${college.key }" >${college.value }</option>
                  		</core:if>
                  	</core:forEach>
                </select>
                
                
        <span style="margin-left:110px;">总负责人:</span>
                <select  name="principalId" id="principalId" style="border:solid #1E5DBA 1px; margin-left:15px; padding:5px; width:200px;" >  
                	<core:forEach items="${members}" var="member">
                		<core:if test="${pp.principalId==member.key }">
                    		<option value="${member.key }" selected>${member.value}</option>
                    	</core:if>
                    	<core:if test="${pp.principalId!=member.key }">
                    		<option value="${member.key }">${member.value}</option>
                    	</core:if>
                    </core:forEach>  
                </select>
         </p>
         
       <span>开始时间:</span>
        <input style="border:solid #1E5DBA 1px;" type="text" value="${pp.startTime }" name="startTime" id="startTime" onclick="return showCalendar('startTime', 'y-mm-dd');"/>
        <span style="margin-left:116px;">结束时间:</span>
        <input style="border:solid #1E5DBA 1px;" type="text" value="${pp.endTime }" name="endTime" id="endTime" onclick="return showCalendar('endTime', 'y-mm-dd');"/></p>
        </div>
        <div class="xuxian" style="margin-top:-36px;">
        <p><span style="margin-left:66px;">指导老师:</span>
                <core:forEach begin="1" end="${instructortotal}" var="i">
                	<core:if test="${i==1}">
		                <select name="instructor1" id="instructor1" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px; margin-top:60px;">  
		                    <core:forEach items="${instructors }" var="instructor">
		                    	<core:if test="${instructor.key==pp.instructor1 }">
		                    		<option  value="${instructor.key }" selected>${instructor.value }</option>
		                    	</core:if>
		                    	
		                    	<core:if test="${instructor.key!=pp.instructor1 }">
		                    		<option value="${instructor.key }">${instructor.value }</option>
		                    	</core:if>		                    	
		                    </core:forEach>  
		                </select>
	                </core:if>
	              <core:if test="${i==2}">
		                <select name="instructor2" id="instructor2" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px; margin-top:60px;">  
		                    <core:forEach items="${instructors }" var="instructor">
		                    	<core:if test="${instructor.key==pp.instructor2 }">
		                    		<option value="${instructor.key }" selected>${instructor.value }</option>
		                    	</core:if>
		                    	
		                    	<core:if test="${instructor.key!=pp.instructor2 }">
		                    		<option value="${instructor.key }">${instructor.value }</option>
		                    	</core:if>
		                    </core:forEach>  
		                </select>
	                </core:if>
                </core:forEach>
                
                <core:forEach begin="${instructortotal+1}" end="2" var="i">
                	<core:if test="${i==1}">
		                <select name="instructor1" id="instructor1" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px; margin-top:60px;">  
		                    <core:forEach items="${instructors }" var="instructor">
		                    		<option  value="${instructor.key }">${instructor.value }</option>		              	
		                    </core:forEach>  
		                </select>
	                </core:if>
	              <core:if test="${i==2}">
		                <select name="instructor2" id="instructor2" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px; margin-top:60px;">  
		                    <core:forEach items="${instructors }" var="instructor">
		                    	<option  value="${instructor.key }">${instructor.value }</option>
		                    </core:forEach>  
		                </select>
	                </core:if>
                </core:forEach>
       </span>
                
                
                
                
           <p style="margin-top:-15px"><span style="margin-left:66px;">项目成员:</span>
                <core:forEach begin="1" end="${membertotal }" var="i">
                	<core:if test="${i==1}">
           			    <select name="student1" id="student1" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px;">  
		                    <core:forEach items="${members}" var="member">
		                    	<core:if test="${pp.student1==member.key }">
		                    		<option  value="${member.key }" selected="selected">${member.value }</option>
		                    	</core:if>
		                    	<core:if test="${pp.student1!=member.key }">
		                    		<option  value="${member.key }" >${member.value }</option>
		                    	</core:if>
		                    </core:forEach>      
              			</select>
           			</core:if>
           			<core:if test="${i==2}">
           			    <select name="student2" id="student2" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px;">  
		                    <core:forEach items="${members}" var="member">
		                    	<core:if test="${pp.student2==member.key }">
		                    		<option  value="${member.key }" selected="selected">${member.value }</option>
		                    	</core:if>
		                    		<core:if test="${pp.student2!=member.key }">
		                    		<option  value="${member.key }" >${member.value }</option>
		                    	</core:if>
		                    </core:forEach>      
              			</select>
           			</core:if>
           			<core:if test="${i==3}">
           			    <select name="student3" id="student3" style="border:solid #1E5DBA 1px;margin-left:152px;padding:5px; width:210px;">  
		                    <core:forEach items="${members}" var="member">
		                    	<core:if test="${pp.student3==member.key }">
		                    		<option value="${member.key }" selected="selected">${member.value }</option>
		                    	</core:if>
		                    		<core:if test="${pp.student3!=member.key }">
		                    		<option  value="${member.key }" >${member.value }</option>
		                    	</core:if>
		                    </core:forEach>      
              			</select>
           			</core:if>
           			<core:if test="${i==4}">
           			    <select name="student4" id="student4" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px;">  
		                    <core:forEach items="${members}" var="member">
		                    	<core:if test="${pp.student4==member.key }">
		                    		<option  value="${member.key }" selected="selected">${member.value }</option>
		                    	</core:if>
		                    		<core:if test="${pp.student4!=member.key }">
		                    		<option  value="${member.key }" >${member.value }</option>
		                    	</core:if>
		                    </core:forEach>      
              			</select>
           			</core:if>
            	</core:forEach>
            	
            	
            	<core:forEach begin="${membertotal+1 }" end="4" var="i">
            		<core:if test="${i==1}">
           			    <select name="student1" id="student1" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px;">  
		                    <core:forEach items="${members}" var="member">
		                    	<option  value="${member.key }">${member.value }</option>
		                    </core:forEach>      
              			</select>
           			</core:if>
           			<core:if test="${i==2}">
           			    <select name="student2" id="student2" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px;">  
		                    <core:forEach items="${members}" var="member">
		                    	<option  value="${member.key }">${member.value }</option>
		                    </core:forEach>      
              			</select>
           			</core:if>
           			<core:if test="${i==3}">
           			    <select name="student3" id="student3" style="border:solid #1E5DBA 1px;margin-left:152px;padding:5px; width:210px;">  
		                    <core:forEach items="${members}" var="member">
		                    	<option  value="${member.key }">${member.value }</option>
		                    </core:forEach>      
              			</select>
           			</core:if>
           			<core:if test="${i==4}">
           			    <select name="student4" id="student4" style="border:solid #1E5DBA 1px;margin-left:10px;padding:5px; width:210px;">  
		                    <core:forEach items="${members}" var="member">
		                    	<option  value="${member.key }">${member.value }</option>
		                    </core:forEach>      
              			</select>
           			</core:if>
            	
            	</core:forEach>
               
           </p>
         
        <div class="xuxian" style="margin-top:-50px;"></div>
       <span style="margin-left:68px;">项目简介:</span>
  
         <script id="editor" type="text/plain" style="width:900px;height:250px;"></script>
            
          <div id="result" style="height: 20px;text-align: center;color: red">
   			</div>
   			
           <p style="margin-left: 20px">
           <input type="button" onclick="return jiaoyan('student/updateProject','修改成功','student/lookReportProjectUI','修改项目申报成功，即将返回........')" style="width:100px;margin-left:280px;" value="确定"/> 
           <input type="button" onclick="javascript:window.location.href='student/downloadReportBook'" style="width:100px;margin-left:110px;" value="下载项目申报书"/>
           </p>

        </div>
      </div>	

	<script type="text/javascript">

    //实例化编辑器
    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
    var ue = UE.getEditor('editor');


    function getContent() {
        var arr = [];
        arr.push("使用editor.getContent()方法可以获得编辑器的内容");
        arr.push("内容为：");
        arr.push(UE.getEditor('editor').getContent());
       
    }
    
    function setContent(isAppendTo) {
        var arr = [];
        arr.push("使用editor.setContent('欢迎使用ueditor')方法可以设置编辑器的内容");
        UE.getEditor('editor').setContent('${pp.description}', isAppendTo);
     
    }
    

   
 
   
</script>
</body>
</html>