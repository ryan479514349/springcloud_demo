package com.ruanhao.provider.service;

import com.ruanhao.provider.entity.IicEuserAdmin;
import com.ruanhao.provider.res.QueryUserRes;

import java.util.List;

/**
 * @author Ryan
 * @Date 2020/3/28 0028 19:06
 */
public interface IUserService {
    IicEuserAdmin getUserById(Long userId);

    List<IicEuserAdmin> getInPutUser();

    Integer saveInPutUser(QueryUserRes res);
}
