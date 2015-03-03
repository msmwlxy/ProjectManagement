function toPage(currentPage){
	
		var form = document.forms[0];
		form.currentPage.value = currentPage;
		form.submit();
		
	}