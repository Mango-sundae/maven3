package com.mango.utils;

import java.util.List;

public class PageDataView<T> {
	
	private int currentPage=1;
	private int pageSize;
	private long totalPages;
	private long totalDatas;
	private List<T> dataList;
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}
	public long getTotalDatas() {
		return totalDatas;
	}
	public void setTotalDatas(long totalDatas) {
		this.totalDatas = totalDatas;
		this.totalPages=this.totalDatas%this.pageSize==0?totalDatas/this.pageSize:totalDatas/this.pageSize+1;
	}
	public List<T> getDataList() {
		return dataList;
	}
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	
	

}
