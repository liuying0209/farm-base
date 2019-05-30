package com.farm.base.record;

import java.util.Date;

/**
 * 具体农事环节参数类
 *
 ** @version 1.0.0
 */
public class FarmingParam {

    private Long id;
    /**
     * 农事记录 id
     */
    private Long recordId;


    private Date createTime;

    private Date updateTime;

    /**
     * 页面参数
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}