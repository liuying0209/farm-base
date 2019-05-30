package com.farm.base.record;

import java.io.Serializable;

/**
 * 具体页面文案内容对象
 *
 ** @Version 1.0.0
 */
public class ParamContent implements Serializable {
    private static final long serialVersionUID = -5302163880904820466L;


    /**
     * 文案名称
     */
    private String name;
    /**
     * 具体值
     */
    private Object value;

    /**
     * 是否完成标识 0-未开始 1-已完成 2-未完成
     */

    private String flag;
    /**
     * 时间
     */
    private String createTime;

    /**
     * type 类型 0 -图片 1-文字 2-大类
     */

    private String type;

    /**
     * 单位
     */
    private String unit;

    /**
     * 每一项默认得分
     */
    private Integer score;


    public ParamContent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ParamContent{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", flag='" + flag + '\'' +
                ", createTime='" + createTime + '\'' +
                ", type='" + type + '\'' +
                ", unit='" + unit + '\'' +
                ", score=" + score +
                '}';
    }
}
