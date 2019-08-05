/*$(function(){
	
	$(".team").on('click',function(event) {
		let id = $(this).attr("id")
		var team = {pg_team , "sktt1"}
		if(id == sktt1){
			$("#modal-box").css("display","block")
			$.ajax({
				url : "${rootPath}/gamer/team",
				method : "POST",
				type : "json",
				contentType : "application/json",
				data : JSON.stringify(team)
			})
			.done(function(result) {
				("#modal-body").html(result)
				$(".modal-header h2").html("SKT T1")
				$(".modal-header h2").css("text-align","center")
				$(".modal-footer h3").html("<address> CopyRight &copy; dbsqhtjs@naver.com</address>")
				$(".modal-footer h3").css("text-align","right")
			})
			.fail(function() {
				alert("ㅁㄴㅇㄹ")
			})
			.always(function() {
				alert("ㅁㄴㅇㄻㄴㅇㄹ")
			})
		}
		
		
		
	})
})*/
