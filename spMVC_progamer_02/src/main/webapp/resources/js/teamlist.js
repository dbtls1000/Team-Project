$(function(){
	
	$(".team").click(function() {
		let team = $(this).attr("id")
		
		if(team == SKTT1){
			$.ajax({
				url : "${rootPath}/gamer/team",
				method : "GET",
			})
			.done(function(result) {
				("#modal-body").html(result)
				$(".modal-header h2").html("SKT T1")
				$(".modal-header h2").css("text-align","center")
				$(".modal-footer h3").html("<address> CopyRight &copy; dbsqhtjs@naver.com</address>")
				$(".modal-footer h3").css("text-align","right")
			})
		}
		
		
		
	})
})
