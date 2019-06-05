package com.farm.base.farm;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  liuying
 * @Date 2019-06-04 
 */


public class FarmQuestion  implements Serializable {

	private static final long serialVersionUID =  4233659673500671836L;

	private Long id;

	private String title;

	/**
	 * 创建人id
	 */
	private String creatorId;

	/**
	 * 更新人id
	 */
	private String updaterId;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 0是正常数据，1是已删除数据
	 */
	private Integer delFlag;


	@Override
	public String toString() {
		return "FarmQuestion{" +
				"id=" + id +
				", title='" + title + '\'' +
				", creatorId='" + creatorId+'\'' +
				", updaterId='" + updaterId +'\''+
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				", delFlag="+delFlag+
				'}';
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getUpdaterId() {
		return updaterId;
	}

	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
}
