package com.ruanhao.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruanhao.provider.entity.IicEuserAdminUser;
import com.ruanhao.provider.req.QueryAdminUserManageListReq;
import com.ruanhao.provider.res.QueryAdminUserManageListRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Ryan
 * @Date 2020/3/16 0016 15:04
 */
@Mapper
public interface AdminUserManageMapper extends BaseMapper<IicEuserAdminUser> {

    List<QueryAdminUserManageListRes> queryAdminUserManageList(QueryAdminUserManageListReq queryAdminUserManageListReq);
}
