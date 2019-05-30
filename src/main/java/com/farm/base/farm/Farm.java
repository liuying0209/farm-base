package com.farm.base.farm;

import com.farm.base.common.enums.UnitEnum;

import java.io.Serializable;
import java.util.Date;


/**
 * 农场类
 *
 ** @Date: 2019-04-20 20:54
 */

public class Farm implements Serializable {
    private static final long serialVersionUID = -3874896279504490551L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 农场名称
     */
    private String name;

    /**
     * 农场面积
     */
    private Integer area;

    /**
     * 单位   0-亩 1-平方米
     */
    private UnitEnum unit;
    /**
     * 农场总的分
     */
    private Integer score;

    /**
     * 创建人id
     */
    private String creatorId;
    /**
     * 暖棚
     */
    private Integer brooderCount;
    /**
     * 冷棚数量
     */
    private Integer coolCount;

    private Date createTime;

    private Date updateTime;


    public Farm() {
    }

    @Override
    public String toString() {
        return "Farm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", unit=" + unit +
                ", score=" + score +
                ", creatorId='" + creatorId + '\'' +
                ", brooderCount=" + brooderCount +
                ", coolCount=" + coolCount +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getBrooderCount() {
        return brooderCount;
    }

    public void setBrooderCount(Integer brooderCount) {
        this.brooderCount = brooderCount;
    }

    public Integer getCoolCount() {
        return coolCount;
    }

    public void setCoolCount(Integer coolCount) {
        this.coolCount = coolCount;
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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
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
}