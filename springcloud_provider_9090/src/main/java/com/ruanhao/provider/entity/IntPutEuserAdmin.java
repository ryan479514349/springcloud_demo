package com.ruanhao.provider.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Ryan
 * @Date 2021/4/4 0004 10:20
 */
public class IntPutEuserAdmin implements Serializable {

    private String userDId;

    private String orgDId;

    private String userDPassword;

    private String dEmail;

    private String userDChName;

    private String userDPhotoUrl;

    private String provinceDId;

    private String cityDName;

    private String provinceDName;

    private String cityDId;

    private String hobbyD;

    private String countryDId;

    private String introduceD;

    private String mrgDId;

    //用户名
    private String userDName;

    //电话
    private String mobileDPhone;

    //出生日期
    private Date userDBirthday;


    //性别
    private Short userDSex;

    //创建时间
    private Date createdDDate;

    private String contryDName;

    public String getUserDName() {
        return userDName;
    }

    public void setUserDName(String userDName) {
        this.userDName = userDName;
    }

    public String getMobileDPhone() {
        return mobileDPhone;
    }

    public void setMobileDPhone(String mobileDPhone) {
        this.mobileDPhone = mobileDPhone;
    }

    public Date getUserDBirthday() {
        return userDBirthday;
    }

    public void setUserDBirthday(Date userDBirthday) {
        this.userDBirthday = userDBirthday;
    }

    public Short getUserDSex() {
        return userDSex;
    }

    public void setUserDSex(Short userDSex) {
        this.userDSex = userDSex;
    }

    public Date getCreatedDDate() {
        return createdDDate;
    }

    public void setCreatedDDate(Date createdDDate) {
        this.createdDDate = createdDDate;
    }

    public String getContryDName() {
        return contryDName;
    }

    public void setContryDName(String contryDName) {
        this.contryDName = contryDName;
    }

    public String getUserDId() {
        return userDId;
    }

    public void setUserDId(String userDId) {
        this.userDId = userDId;
    }

    public String getOrgDId() {
        return orgDId;
    }

    public void setOrgDId(String orgDId) {
        this.orgDId = orgDId;
    }

    public String getUserDPassword() {
        return userDPassword;
    }

    public void setUserDPassword(String userDPassword) {
        this.userDPassword = userDPassword;
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail;
    }

    public String getUserDChName() {
        return userDChName;
    }

    public void setUserDChName(String userDChName) {
        this.userDChName = userDChName;
    }

    public String getUserDPhotoUrl() {
        return userDPhotoUrl;
    }

    public void setUserDPhotoUrl(String userDPhotoUrl) {
        this.userDPhotoUrl = userDPhotoUrl;
    }

    public String getProvinceDId() {
        return provinceDId;
    }

    public void setProvinceDId(String provinceDId) {
        this.provinceDId = provinceDId;
    }

    public String getCityDName() {
        return cityDName;
    }

    public void setCityDName(String cityDName) {
        this.cityDName = cityDName;
    }

    public String getProvinceDName() {
        return provinceDName;
    }

    public void setProvinceDName(String provinceDName) {
        this.provinceDName = provinceDName;
    }

    public String getCityDId() {
        return cityDId;
    }

    public void setCityDId(String cityDId) {
        this.cityDId = cityDId;
    }

    public String getHobbyD() {
        return hobbyD;
    }

    public void setHobbyD(String hobbyD) {
        this.hobbyD = hobbyD;
    }

    public String getCountryDId() {
        return countryDId;
    }

    public void setCountryDId(String countryDId) {
        this.countryDId = countryDId;
    }

    public String getIntroduceD() {
        return introduceD;
    }

    public void setIntroduceD(String introduceD) {
        this.introduceD = introduceD;
    }

    public String getMrgDId() {
        return mrgDId;
    }

    public void setMrgDId(String mrgDId) {
        this.mrgDId = mrgDId;
    }
}
