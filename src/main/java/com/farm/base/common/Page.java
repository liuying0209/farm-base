package com.farm.base.common;

import java.io.Serializable;
import java.util.List;

/**
 * 通用包含分页查询工具类
 *
 ** @Date: 2018-12-21 11:27
 */
public class Page<T> implements Serializable {
	private static final long serialVersionUID = -8696653421536792838L;

	/**
	 * 数据库页码索引
	 */
	private Integer pageStart;

	private Integer pageSize;

	/**
	 * 分页参数数据
	 */
	private T t;

	private Integer totalCount;

	private List data;

	public Page() {
	}

	public Page(Integer pageNo, Integer pageSize) {
		this.pageStart = (pageNo - 1) * pageSize;
		this.pageSize =pageSize;
	}

	public Page(Integer pageNo, Integer pageSize, T t) {
		this.pageStart = (pageNo - 1) * pageSize;
		this.pageSize = pageSize;
		this.t = t;
	}

	public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}


	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}


}