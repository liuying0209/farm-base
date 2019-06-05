package com.farm.base.farm;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  liuying
 * @Date 2019-06-04 
 */


public class FarmAnswers  implements Serializable {

	private static final long serialVersionUID =  6452767275479287024L;


	private Long id;

	/**
	 * farm_question.id
	 */
	private Long questionId;

	/**
	 * A或B或C或D
	 */
	private String options;

	/**
	 * 选项内容
	 */
	private String context;

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
		return "FarmAnswers{" +
				"id=" + id +
				", questionId='" + questionId + '\'' +
				", options="+ options +
				", context="+context+
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

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
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
