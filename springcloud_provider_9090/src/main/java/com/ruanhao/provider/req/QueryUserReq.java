package com.ruanhao.provider.req;

import lombok.Data;

import java.util.Date;

/**
 * @author Ryan
 * @Date 2021/4/4 0004 8:24
 */
@Data
public class QueryUserReq {

    //用户I名
    private String userName;

    //电话
    private String mobilePhone;

    //出生日期
    private Date userBirthday;

    //性别
    private String userSex;

    //创建时间
    private String createdDate;

}

