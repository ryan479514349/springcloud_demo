package com.ruanhao.provider.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruanhao.provider.bo.QueryAdminUserManageListBo;
import com.ruanhao.provider.exception.IIcRuntimeException;
import com.ruanhao.provider.mapper.AdminUserManageMapper;
import com.ruanhao.provider.req.QueryAdminUserManageListReq;
import com.ruanhao.provider.res.QueryAdminUserManageListRes;
import com.ruanhao.provider.service.AdminUserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ryan
 * @Date 2020/3/16 0016 14:33
 */
@Service
public class AdminUserManageServiceImpl implements AdminUserManageService {

    @Autowired
    private AdminUserManageMapper manageMapper;

    @Override
    public PageInfo<QueryAdminUserManageListRes> queryAdminUserManageList(String language, QueryAdminUserManageListReq queryAdminUserManageListReq) throws IIcRuntimeException {

        QueryAdminUserManageListBo queryAdminUserManageListBo = new QueryAdminUserManageListBo();
        queryAdminUserManageListBo.setLanguage(language);
        PageHelper.startPage(queryAdminUserManageListReq.getPageNum(), queryAdminUserManageListReq.getPageSize());
        List<QueryAdminUserManageListRes> dataList = manageMapper.queryAdminUserManageList(queryAdminUserManageListReq);
        return new PageInfo<>(dataList);
    }
}
