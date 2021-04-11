package com.ruanhao.provider.res;

import lombok.Data;

import java.util.Date;

/**
 * @author Ryan
 * @Date 2021/4/4 0004 8:35
 */
@Data
public class QueryUserRes {
    //用户I名
    private String userDName;

    //电话
    private String mobileDPhone;

    //出生日期
    private Date userBirthDday;

    //性别
    private Short userDSex;

    //创建时间
    private Date createdDDate;

    private String contryDName;

}
