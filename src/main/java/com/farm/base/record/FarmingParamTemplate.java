package com.farm.base.record;

/**
 * 具体农事环节参数模板类
 *
 ** @version 1.0.0
 */
public class FarmingParamTemplate {

    private Long id;

    /**
     * 农事环节id
     */
    private Long farmWorkId;

    /**
     * 作物id
     */
    private Long cropId;

    /**
     * 父节点id
     */
    private Long parentId;

    /**
     * 具体内容
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFarmWorkId() {
        return farmWorkId;
    }

    public void setFarmWorkId(Long farmWorkId) {
        this.farmWorkId = farmWorkId;
    }

    public Long getCropId() {
        return cropId;
    }

    public void setCropId(Long cropId) {
        this.cropId = cropId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "FarmingParamTemplate{" +
                "id=" + id +
                ", farmWorkId=" + farmWorkId +
                ", cropId=" + cropId +
                ", parentId=" + parentId +
                ", content='" + content + '\'' +
                '}';
    }
}