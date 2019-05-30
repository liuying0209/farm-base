package com.farm.base.user;

import com.farm.base.common.enums.SexEnum;
import com.farm.base.common.enums.UserStatusEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 可信农场 用户类
 *
 ** @Date: 2019-04-20 20:54
 */
public class User implements Serializable {
    private static final long serialVersionUID = 6625947245926222911L;
    /**
     * 主键
     */
    private String id;
    /**
     * 手机好吗
     */
    private String mobileNumber;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别
     */
    private SexEnum sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */

    private String password;

    /**
     * 状态
     */
    private UserStatusEnum status;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 身份证 照片
     */
    private String idCardImage;

    /**
     * 农场照片
     */
    private String farmImage;

    /**
     * 营业执照照片，多张照片 ，隔开
     */
    private String businessLicense;

    /**
     * 资质认证照片 多张照片 ，隔开
     */
    private String qualification;

    /**
     * 头像照片
     */
    private String photo;

    /**
     * 注册时间
     */
    private Date registerTime;


    /**
     * 用户来源 app dd h5 config
     */
    private String source;

    /**
     * 答题分数
     */
    private Integer answerScore;
    /**
     * 默认农场id
     */
    private Long defaultFarmId;


    private Date createTime;

    private Date updateTime;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", realName='" + realName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", idCard='" + idCard + '\'' +
                ", idCardImage='" + idCardImage + '\'' +
                ", farmImage='" + farmImage + '\'' +
                ", businessLicense='" + businessLicense + '\'' +
                ", qualification='" + qualification + '\'' +
                ", photo='" + photo + '\'' +
                ", registerTime=" + registerTime +
                ", source='" + source + '\'' +
                ", answerScore=" + answerScore +
                ", defaultFarmId=" + defaultFarmId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCardImage() {
        return idCardImage;
    }

    public void setIdCardImage(String idCardImage) {
        this.idCardImage = idCardImage;
    }

    public String getFarmImage() {
        return farmImage;
    }

    public void setFarmImage(String farmImage) {
        this.farmImage = farmImage;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getAnswerScore() {
        return answerScore;
    }

    public void setAnswerScore(Integer answerScore) {
        this.answerScore = answerScore;
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

    public Long getDefaultFarmId() {
        return defaultFarmId;
    }

    public void setDefaultFarmId(Long defaultFarmId) {
        this.defaultFarmId = defaultFarmId;
    }
}