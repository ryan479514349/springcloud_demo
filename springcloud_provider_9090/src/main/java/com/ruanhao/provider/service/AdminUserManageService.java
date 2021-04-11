package com.ruanhao.provider.service;

import com.github.pagehelper.PageInfo;
import com.ruanhao.provider.exception.IIcRuntimeException;
import com.ruanhao.provider.req.QueryAdminUserManageListReq;
import com.ruanhao.provider.res.QueryAdminUserManageListRes;

/**
 * @author Ryan
 * @Date 2020/3/15 0015 18:32
 */
public interface AdminUserManageService {
    PageInfo<QueryAdminUserManageListRes> queryAdminUserManageList(String language, QueryAdminUserManageListReq queryAdminUserManageListReq) throws IIcRuntimeException;
}
