package com.farm.base.record;

import com.farm.base.common.enums.DeductMarksTypeEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 记录评估类
 */
public class RecordAssess implements Serializable {
    private static final long serialVersionUID = -6244069307111377260L;
    private Long id;

    /**
     * 记录id
     */
    private Long recordId;

    /**
     * 扣分说明
     */
    private String reason;

    /**
     * 扣分
     */
    private Integer deductMarks;

    /**
     * 扣分类型 0-存疑图片 1-严重作弊行为
     */
    private DeductMarksTypeEnum deductMarksType;

    /**
     * 创建人id
     */
    private Long adminId;

    private Date createTime;

    private Date updateTime;

    public RecordAssess() {
    }

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getDeductMarks() {
        return deductMarks;
    }

    public void setDeductMarks(Integer deductMarks) {
        this.deductMarks = deductMarks;
    }

    public DeductMarksTypeEnum getDeductMarksType() {
        return deductMarksType;
    }

    public void setDeductMarksType(DeductMarksTypeEnum deductMarksType) {
        this.deductMarksType = deductMarksType;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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
        return "RecordAssess{" +
                "id=" + id +
                ", recordId=" + recordId +
                ", reason='" + reason + '\'' +
                ", deductMarks=" + deductMarks +
                ", deductMarksType=" + deductMarksType +
                ", adminId=" + adminId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}