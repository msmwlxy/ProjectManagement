<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/student/share/taglib.jsp" %>
<%@ include file="/WEB-INF/jsp/student/share/basepath.jsp"  %>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="pragma" content="no-cache"  />
 <meta http-equiv="content-type" content="no-cache, must-revalidate" />
 <meta http-equiv="expires" content="Wed, 26 Feb 1997 08:21:57 GMT"/>
   
<link href="css/uploadPaper.css?version=2" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="js/ajaxfileupload.js"></script>
<script type="text/javascript" src="js/uploadAjax.js"></script>

<title>上传成果图片</title>
</head>
<body>	
	  <div class="right">
        <div class="right_top">
          <div class="xiangji">
           <img src="images/shangchuan.gif" width="25" height="19">
          </div>
         <div class="wenzi">
          	上传成果图片
         </div> 
        </div>
        <div class="xiantiao"><img src="images/xian.png" width="846" height="4">
        </div>
        <div class="sanjiao">
         
       	<input type="hidden" id="projectId" value="${pp.projectId }"/>
     	  	<div class="upload" style="	margin-top:60px;"><font style="font-size: 16px">上传成果图片:</font>
        	<input type="file" multiple name="achImages" id="upload" style="margin:50px auto auto 0px;vertical-align:4px;"/>
          	<p style="margin:-30px -40px;"><input type="button" style="width:100px;margin:60px 400px;" value="确定" 
          	onclick="return jiaoyan('student/uploadAchImage','上传成果图片成功','student/uploadAchImageFUI','上传成果图片成功，即将返回......')"/>
           </p>
   </div>
         <div id="result" style="height: 20px;text-align: center;color:green;margin-left:-300px;">
   		
   			</div>
        </div>
      </div>	
	
</body>
</html>
