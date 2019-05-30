package com.farm.base.record;

import com.farm.base.common.enums.DeductMarksTypeEnum;
import com.farm.base.common.enums.FarmingRecordStatusEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 农事环节记录类
 *
 ** @Date: 2019-04-20 20:54
 */

public class FarmingRecord implements Serializable {

    private static final long serialVersionUID = -3625654354518268384L;

    /**
     * 记录主键
     */
    private Long id;

    /**
     * 品种作物编号
     */
    private Long plotCropId;


    /**
     * 农事环节编号
     */
    private Long farmWorkId;

    /**
     * 农事环节父节点编号
     */
    private Long parentId;
    /**
     * 父节点记录id
     */
    private Long parentRecordId;

    /**
     * 农事环节名称
     */
    private String farmWorkName;

    /**
     * 农事环节得分数
     */
    private Integer score;

    /**
     * 系统扣分描述
     */
    private String remark;
    /**
     * 排序号
     */
    private Integer indexNumber;

    /**
     * 农事时间
     */
    private Date time;

    /**
     * 完成状态 0-待完成，1-已完成
     */
    private FarmingRecordStatusEnum status;

    /**
     * 是否评估标识 0-否 1-是 默认0
     */
    private Integer assessFlag;
    /**
     * 是否追加农事环节标识 0-否 1-是
     */
    private Integer addFlag;

    /**
     * 模块类型 0-固定型 1-机动型
     */
    private Integer type;
    /**
     * 归类 0-直接拍摄  1-前置任务  2-细分子任务
     */
    private Integer category;

    /**
     * 被追加农事环节的id
     */
    private Long appendedId;


    private Date createTime;

    private Date updateTime;


    public FarmingRecord() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlotCropId() {
        return plotCropId;
    }

    public void setPlotCropId(Long plotCropId) {
        this.plotCropId = plotCropId;
    }

    public Long getFarmWorkId() {
        return farmWorkId;
    }

    public void setFarmWorkId(Long farmWorkId) {
        this.farmWorkId = farmWorkId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentRecordId() {
        return parentRecordId;
    }

    public void setParentRecordId(Long parentRecordId) {
        this.parentRecordId = parentRecordId;
    }

    public String getFarmWorkName() {
        return farmWorkName;
    }

    public void setFarmWorkName(String farmWorkName) {
        this.farmWorkName = farmWorkName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(Integer indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public FarmingRecordStatusEnum getStatus() {
        return status;
    }

    public void setStatus(FarmingRecordStatusEnum status) {
        this.status = status;
    }

    public Integer getAssessFlag() {
        return assessFlag;
    }

    public void setAssessFlag(Integer assessFlag) {
        this.assessFlag = assessFlag;
    }

    public Integer getAddFlag() {
        return addFlag;
    }

    public void setAddFlag(Integer addFlag) {
        this.addFlag = addFlag;
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

    public Long getAppendedId() {
        return appendedId;
    }

    public void setAppendedId(Long appendedId) {
        this.appendedId = appendedId;
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

    @Override
    public String toString() {
        return "FarmingRecord{" +
                "id=" + id +
                ", plotCropId=" + plotCropId +
                ", farmWorkId=" + farmWorkId +
                ", parentId=" + parentId +
                ", parentRecordId=" + parentRecordId +
                ", farmWorkName='" + farmWorkName + '\'' +
                ", score=" + score +
                ", remark='" + remark + '\'' +
                ", indexNumber=" + indexNumber +
                ", time=" + time +
                ", status=" + status +
                ", assessFlag=" + assessFlag +
                ", addFlag=" + addFlag +
                ", type=" + type +
                ", category=" + category +
                ", appendedId=" + appendedId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}