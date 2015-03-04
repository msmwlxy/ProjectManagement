<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/student/share/taglib.jsp" %>
<%@ include file="/WEB-INF/jsp/student/share/basepath.jsp"  %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>消息提示页面</title>
    <meta http-equiv="Refresh" content="1;url=${returnUrl }">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
<script src="js/jquery-2.1.1.js" type="text/javascript"></script>
<script src="js/jquery.shCircleLoader.js" type="text/javascript"></script>
<style type="text/css">
body  {text-align:center;}
h2 {margin:5px;padding:0}
div[id] {width:100px; height:100px; margin:10px auto;}
span {font-family:monospace;font-size: 14px}
pre {text-align:left;margin:0 auto;border:1px solid #888;padding:3px;width:400px;background:#eee}
.myns > div {
    box-shadow: 0 0 6px black, inset 0 0 6px black;
}

</style>


  </head>
  
  <body>
  <div id="shclNs" style="margin-top: 150px"></div>
  <div id="message" style="width:300px">${promptMessage}</div><br>
  

  <script type="text/javascript">
$('#shclDefault').shCircleLoader();
$('#shclCcw').shCircleLoader({clockwise:false});
$('#shclColor').shCircleLoader({color:"#f00"});
$('#shclDuration').shCircleLoader({duration: 2});
$('#shclDots').shCircleLoader({dots:24,dotsRadius:10});
$('#shclKeyframes').shCircleLoader({keyframes:"0%{background:black}40%{background:transparent}60%{background:transparent}100%{background:black}"});
$('#shclNs').shCircleLoader({namespace:"myns",color:"transparent",dotsRadius:15});
$('#shclFireballs').shCircleLoader({
    color: "red",
    dots: 24,
    dotsRadius: 13,
    keyframes:
       "0%   {background: red;    {prefix}transform: scale(1)}\
        20%  {background: orange; {prefix}transform: scale(.4)}\
        40%  {background: red;    {prefix}transform: scale(0)}\
        50%  {background: red;    {prefix}transform: scale(1)}\
        70%  {background: orange; {prefix}transform: scale(.4)}\
        90%  {background: red;    {prefix}transform: scale(0)}\
        100% {background: red;    {prefix}transform: scale(1)}"
});

$('#shclProgress').shCircleLoader();
var i = 0;
setInterval(function() {
    $('#shclProgress').shCircleLoader('progress', i + '%');
    if (++i > 100) i = 0;
}, 100);
</script>
  </body>
</html>
