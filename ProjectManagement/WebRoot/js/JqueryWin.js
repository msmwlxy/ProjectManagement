function showwin(e,str){

	var x = getX(e);

	var y = getY(e);

	var win = $("#win");
	//win.css("display","block");
	//win.show("slow");
	win.css("position","absolute");
	win.css("left",x);
	win.css("top",y);
	$("#win").children("#cont").html(str);
	//win.$("#cont").html(str);
	win.show();
	return false;
}

function getX(e) {
	  e = e || window.event;
	    
	return e.pageX || e.clientX + document.body.scroolLeft;
	}
	function getY(e) {
	  e = e|| window.event;
	 return e.pageY || e.clientY + document.boyd.scrollTop;
	} 
$(document).ready(function(){
	
	/*$("#aa").mouseleave(function(e) {  
		
		var win = $("#win");
		//win.css("display","none");
		//win.hide("slow");
		//win.fadeOut("fast");
		win.hide();
	
	});*/
/*	$("#aa").mouseover(function(e) {  
		var x=e.pageX;
		var y=e.pageY;
		
		
		var win = $("#win");
		//win.css("display","block");
		//win.show("slow");
		win.css("position","absolute");
		win.css("left",x);
		win.css("top",y);
	
		//win.$("#cont").html(str);
		win.fadeIn("fast");
		
	
	});*/
	
	}); 
	
function closewin(){
var win = $("#win");
//win.css("display","none");
//win.hide("slow");
win.fadeOut("fast");

}


