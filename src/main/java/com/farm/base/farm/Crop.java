package com.farm.base.farm;

import java.io.Serializable;
import java.util.Date;


/**
 * 农作物类
 *
 ** @Date: 2019-04-20 20:54
 */
public class Crop implements Serializable {
    private static final long serialVersionUID = -480764494988926684L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 农作物名称
     */
    private String name;
    /**
     * 类型
     */
    private Integer type;

    /**
     * 图片
     */
    private String image;

    private Date createTime;

    private Date updateTime;

    public Crop() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", image='" + image + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}