package com.farm.base.farm;

import com.farm.base.common.enums.CropStatusEnum;
import com.farm.base.common.enums.UnitEnum;

import java.io.Serializable;
import java.util.Date;


/**
 * 地块作物关联表
 *
 ** @Date: 2019-04-20 20:54
 */
public class PlotCrop implements Serializable {
    private static final long serialVersionUID = -3416776629721355661L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 地块编号
     */
    private Long plotId;

    /**
     * 作物id
     */
    private Long cropId;

    /**
     * 作物品种
     *
     */
    private String cropVariety;

    /**
     * 农作物名称
     */
    private String cropName;

    /**
     * 地块面积
     */
    private Integer area;

    /**
     * 单位 0-平方米 1-亩
     */
    private UnitEnum unit;

    /**
     * 地块名称
     */
    private String plotName;

    /**
     * 批次时间   作物设定时间 2018-01-01
     */

    private  String batchTime;

    /**
     * 用户名
     */
    private String userId;
    /**
     * 分数
     */
    private Integer score;

    /**
     * 预计得分
     */
    private Integer rawScore=0;

    /**
     * 作物状态  0-种植中 2-已终止
     */
    private CropStatusEnum status;

    private Date createTime;

    private Date updateTime;

    public PlotCrop() {
    }

    @Override
    public String toString() {
        return "PlotCrop{" +
                "id=" + id +
                ", plotId=" + plotId +
                ", cropId=" + cropId +
                ", cropVariety='" + cropVariety + '\'' +
                ", cropName='" + cropName + '\'' +
                ", area=" + area +
                ", unit=" + unit +
                ", plotName='" + plotName + '\'' +
                ", batchTime='" + batchTime + '\'' +
                ", userId='" + userId + '\'' +
                ", score=" + score +
                ", rawScore=" + rawScore +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlotId() {
        return plotId;
    }

    public void setPlotId(Long plotId) {
        this.plotId = plotId;
    }

    public Long getCropId() {
        return cropId;
    }

    public void setCropId(Long cropId) {
        this.cropId = cropId;
    }

    public String getCropVariety() {
        return cropVariety;
    }

    public void setCropVariety(String cropVariety) {
        this.cropVariety = cropVariety;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
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

    public String getPlotName() {
        return plotName;
    }

    public void setPlotName(String plotName) {
        this.plotName = plotName;
    }

    public String getBatchTime() {
        return batchTime;
    }

    public void setBatchTime(String batchTime) {
        this.batchTime = batchTime;
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

    public CropStatusEnum getStatus() {
        return status;
    }

    public void setStatus(CropStatusEnum status) {
        this.status = status;
    }

    public Integer getRawScore() {
        return rawScore;
    }

    public void setRawScore(Integer rawScore) {
        this.rawScore = rawScore;
    }
}