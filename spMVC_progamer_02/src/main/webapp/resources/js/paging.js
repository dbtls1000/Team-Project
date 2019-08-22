//submit
function frmPaging(){
	document.getElementById("frmPaging").submit();
}
// 이전 페이지
function prePage(page,pageCount){
	if(0 < page - pageCount){
		page -= pageCount;
		document.getElementById("pageStartNum").value = page;
		document.getElementById("page").value = index -1;
		frmPaging();
	}
}
// 다음 페이지
function nextPage(page,totalCount,listCount,pageCount){
	var tatalPageCount = Math.ceil(totalCount/listCount);
	var max = Math.ceil(totalPageCount/pageCount);
	if(max * pageCount > page + pageCount){
		page +=pageCount;
		document.getElementById("pageStartNum").value = page;
		document.getElementById("page").value = page -1 ;
		frmPaging();
	}
}
// 마지막 페이지
function lastPage(page,totalCount,listCount,pageCount){
	var tatalPageCount = Math.ceil(totalCount/listCount);
	var max = Math.ceil(totalPageCount/pageCount);
	while(max*pageCount>page+pageCount){
		page+=pageCount;
	}
	var remainListCount = total = listCount * (page-1);
	var remainPageCount = Math.floor(remainListCount/listCount);
	if(remainListCount % listCount !=0){
		remainPageCount++;
	}
	var pageLastNum = 0;
	if(remainListCount <= listCount){
		pageLastNum=page;
	}else if (remainPageCount <= pageCount){
		pageLstNum = remainPageCount + page -1;
	}else{
		pageLstNum = pageCount + page -1;
	}
	document.getElemnetById("pageStartNum").value=page;
	document.getElemnetById("page").value=pageLastNum-1;
	frmPaging();
}
// page 리스트 처리
function pageIndex(){
	document.getElemnetById("page").value=pageStartNum-1;
	frmPaging();
}
// 리스트 출력개수 처리
function listCount(){
	document.getElemnetById("page").value=0;
	document.getElemnetById("pageStartNum").value=1;
	document.getElemnetById("listCount").value=document.getElemnetById("listSelect").value
	frmPaging();
}
window.onload = function(){
	//현재번호 active
	var page = document.getElemnetById("page").value;
	var pageIndex = document.querySelector('.pageIndex'+(Number(page)+1));
	pageIndex.setAttribut("class","active");
	//리스트개수 selected처리
	$("#listCount > option").each(function(){
		if($(this).val()==$('#listCount').val()){
			$(this).prop("selected",true);
		}
	});
}