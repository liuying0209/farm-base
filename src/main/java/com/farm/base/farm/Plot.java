package com.farm.base.farm;

import com.farm.base.common.enums.PlotTypeEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 地块类
 *
 ** @Date: 2019-04-20 20:54
 */
public class Plot implements Serializable {
    private static final long serialVersionUID = -9067516353118099546L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 类型 0-暖棚 1-冷棚
     */
    private PlotTypeEnum type;

    /**
     * 暖棚名称
     */
    private String name;

    /**
     * 农场Id
     */
    private Long farmId;

    private Date createTime;

    private Date updateTime;


    public Plot() {
    }

    @Override
    public String toString() {
        return "Plot{" +
                "id=" + id +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", farmId=" + farmId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlotTypeEnum getType() {
        return type;
    }

    public void setType(PlotTypeEnum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFarmId() {
        return farmId;
    }

    public void setFarmId(Long farmId) {
        this.farmId = farmId;
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