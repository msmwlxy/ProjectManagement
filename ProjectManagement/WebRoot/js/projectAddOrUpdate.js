var ReturnUrl;   
var Message;
var PromptMessage;
function jiaoyan(URL,message,returnUrl,promptMessage){
	
    		var name = $("#name").val();
    		if($.trim(name)==""){
    			var resultObj = $("#result");
    			resultObj.html("请填写用户名");
    			return false;
    		}
    		
    		var funds = $("#funds").val();
    		if($.trim(funds)==""){
    			var resultObj = $("#result");
    			resultObj.html("请填写需要的总经费");
    			return false;
    		}
    		var principalId = $("#principalId").val();
    		if($.trim(principalId)=="000"){
    			var resultObj = $("#result");
    			resultObj.html("必须选择一个负责人");
    			return false;
    		}
    		var startTime = $("#startTime").val();
    		if($.trim(startTime)==""){
    			var resultObj = $("#result");
    			resultObj.html("请填写开始时间");
    			return false;
    		}
    		var endTime = $("#endTime").val();
    		if($.trim(endTime)==""){
    			var resultObj = $("#result");
    			resultObj.html("请填写结束时间");
    			return false;
    		}
    	
    		var instructor1 = $("#instructor1").val();
    		var instructor2 = $("#instructor2").val();
    		if($.trim(instructor1)=="000"&&$.trim(instructor2)=="000"){
    			var resultObj = $("#result");
    			resultObj.html("最少选择一个指导老师");
    			return false;
    		}
    	
    		if($.trim(UE.getEditor('editor').getContent())==""){
    			var resultObj = $("#result");
    			resultObj.html("请填写项目简介");
    			return false;
    		}
    		ReturnUrl = returnUrl;
    		Message = message;
    		PromptMessage = promptMessage;
    		$.ajax({
			type:"POST",//请求方式
			url:URL,//请求地址
			async: true,
			data:{name:$("#name").val(),
				startTime:$("#startTime").val(),
				endTime:$("#endTime").val(),
				funds:$("#funds").val(),
				collegeId:$("#collegeId").val(),
				principalId:$("#principalId").val(),
				instructor1:$("#instructor1").val(),
				instructor2:$("#instructor2").val(),
				student1:$("#student1").val(),
				student2:$("#student2").val(),
				student3:$("#student3").val(),
				student4:$("#student4").val(),
				description:UE.getEditor('editor').getContent(),
				projectId:$("#projectId").val()
				},//请求参数
			//dataType:"xml",//告诉jquary返回的数据格式
		
			success:callback//定义交互完成，并且服务器正确返回数据时的回调函数
	});
		return false;
	}
	
	function callback(data){
				
					var types = data;
					
                    if ($.trim(types.toString()) != Message) {
                    																																																																																																																																																																																									
                	   var resultObj = $("#result");
                	  
    				   resultObj.html(data);
                    }
                    else{
               
                    	window.location.href="student/prompt?returnUrl="+ReturnUrl+"&promptMessage="+PromptMessage+"";
                    }
}
	
