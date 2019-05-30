package com.farm.base.farm;

import java.io.Serializable;
import java.util.Date;

/**
 * 农场评估类
 *
 * @version 1.0.0
 **/
public class FarmAssess implements Serializable {
    private static final long serialVersionUID = 5252528075870201245L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 农场编号
     */
    private Long farmId;

    /**
     * 农场名称
     */
    private  String farmName;

    /**
     * 分数
     */
    private Integer score;

    /**
     * 备注
     */
    private String remark;

    private Date createTime;

    private Date updateTime;

    public FarmAssess() {
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFarmId() {
        return farmId;
    }

    public void setFarmId(Long farmId) {
        this.farmId = farmId;
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
        this.remark = remark == null ? null : remark.trim();
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
    public String
    toString() {
        return "FarmAssess{" +
                "id=" + id +
                ", farmId=" + farmId +
                ", score=" + score +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}