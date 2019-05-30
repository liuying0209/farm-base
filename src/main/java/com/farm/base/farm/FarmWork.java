package com.farm.base.farm;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础农事环节类
 *
 * @version 1.0.0
 **/

public class FarmWork implements Serializable {
    private static final long serialVersionUID = 5743716489373791756L;
    /**
     * 编号
     */
    private Long id;

    /**
     * 基础农事环节名称
     */
    private String name;

    /**
     * 模块类型 0-固定型 1-机动型
     */
    private Integer type;
    /**
     * 归类 0-直接拍摄  1-前置任务  2-细分子任务
     */
    private Integer category;

    private Date createTime;

    private Date updateTime;

    /**
     * 对应父类节点id
     */
    private Long parentId;


    public FarmWork() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "FarmWork{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", category=" + category +
                ", parentId=" + parentId +
                '}';
    }
}