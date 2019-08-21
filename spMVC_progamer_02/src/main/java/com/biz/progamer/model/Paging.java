package com.biz.progamer.model;

public class Paging {
	private int pageCount;
	private int page;
	private int pageStartNum;
	private int listCount;
	private int totalCount;
	
	{
		pageCount = 10;
		page = 0;
		pageStartNum=1;
		listCount = 10;
	}
	
	public Paging() {
	}
	
	public int getStart() {
		return page*listCount +1;
	}
	public int getLast() {
		return (page*listCount) +listCount;
	}
	public int getPageLastNum() {
		int remainListCount = totalCount -listCount*(pageStartNum-1);
		int remainPageCount = remainListCount/listCount;
		if(remainListCount % listCount !=0) {
			remainPageCount++;
		}
		int pageLastNum = 0 ;
		if(remainListCount <=listCount) {
			pageLastNum=pageStartNum;
		}else if(remainPageCount <= pageCount) {
			pageLastNum = remainPageCount+pageStartNum -1;
		}else {
			pageLastNum = pageCount+pageStartNum -1;
		}
		return pageLastNum;
	}
	public boolean getLastCheck() {
		int n = (int)Math.ceil((double)totalCount/listCount);
		
		return getPageLastNum() == n ? false: n ==0 ? false:true;
		
	}
	
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageStartNum() {
		return pageStartNum;
	}
	public void setPageStartNum(int pageStartNum) {
		this.pageStartNum = pageStartNum;
	}
	public int getListCount() {
		return listCount;
	}
	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "Paging [pageCount=" + pageCount + ", page=" + page + ", pageStartNum=" + pageStartNum + ", listCount="
				+ listCount + ", totalCount=" + totalCount + "]";
	}
	
}
