package com.ruanhao.provider.service.impl;

import com.ruanhao.provider.entity.IicEuserAdmin;
import com.ruanhao.provider.mapper.IicEuserAdminMapper;
import com.ruanhao.provider.mapper.OutUserMapper;
import com.ruanhao.provider.res.QueryUserRes;
import com.ruanhao.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ryan
 * @Date 2020/3/28 0028 18:53
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private IicEuserAdminMapper adminMapper;

    @Autowired
    private OutUserMapper outUserMapper;

    @Override
    public IicEuserAdmin getUserById(Long userId) {
        IicEuserAdmin userById=adminMapper.selectByPrimaryKey(userId);
        return userById;
    }

    @Override
    public List<IicEuserAdmin> getInPutUser() {
        List<IicEuserAdmin> inPutUser = adminMapper.getInPutUser();
        return inPutUser;
    }

    @Override
    public Integer saveInPutUser(QueryUserRes res) {
        Integer outUser =outUserMapper.saveInPutUser(res);
        return outUser;
    }
}
