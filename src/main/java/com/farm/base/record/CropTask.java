package com.farm.base.record;

import java.io.Serializable;
import java.util.Date;

/**
 * 作物农事关联类
 *
 ** @version 1.0.0
 */
public class CropTask implements Serializable {

    private static final long serialVersionUID = -8795346551424730618L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 作物id
     */
    private Long cropId;

    /**
     * 农事环节id
     */
    private Long farmingId;

    /**
     * 具体农事环节名称
     */
    private String farmingName;
    /**
     * 父节点id
     */
    private Long parentId;

    /**
     * 排序编号
     */
    private Integer number;

    /**
     * 预计得分
     */
    private Integer score;
    /**
     * 管理员id
     */
    private Long adminId;

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

    public CropTask() {
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCropId() {
        return cropId;
    }

    public void setCropId(Long cropId) {
        this.cropId = cropId;
    }

    public Long getFarmingId() {
        return farmingId;
    }

    public void setFarmingId(Long farmingId) {
        this.farmingId = farmingId;
    }

    public String getFarmingName() {
        return farmingName;
    }

    public void setFarmingName(String farmingName) {
        this.farmingName = farmingName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CropTask{" +
                "id=" + id +
                ", cropId=" + cropId +
                ", farmingId=" + farmingId +
                ", farmingName='" + farmingName + '\'' +
                ", parentId=" + parentId +
                ", number=" + number +
                ", score=" + score +
                ", adminId=" + adminId +
                ", type=" + type +
                ", category=" + category +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}