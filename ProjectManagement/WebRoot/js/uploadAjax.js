var ReturnUrl;   
var Message;
var PromptMessage;
function jiaoyan(URL,message,returnUrl,promptMessage){
    	/*
    		var upload = $("#upload").val();
    		alert(upload);
    	
    	
    		if(upload.length <= 0){
    			alert("sdfsdf");
    			var resultObj = $("#result");
    			resultObj.html("请上传文ssdff件");
    			return false;
    		}*/
		
			ReturnUrl = returnUrl;
    		Message = message;
    		PromptMessage = promptMessage;
    		$.ajaxFileUpload({  
    	        url:URL,   //submit to UploadFileServlet  
    	        secureuri:false, 
    	        data:
    	        {projectId:$("#projectId").val()},
    	        fileElementId:'upload',  
    	       
    	        dataType:'text', //or json xml whatever you like~  
    	        success:callback
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