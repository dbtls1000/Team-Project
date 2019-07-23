$(function(){
	
	
	$("#m_password").keyup(function(){
		$("#check").html("");
	})
	
	$("#m_repassword").keyup(function(){
		
		if($("#m_password").val() != $("#m_repassword").val() ){
			$("#check").html("비밀번호 불일치<br>")
			$("#check").attr("color","red")
		} else {
			$("#check").html("비밀번호 일치<br>")
			$("#check").attr("color","blue")
		}
		
	})
	
})
