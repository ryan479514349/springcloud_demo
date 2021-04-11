package com.ruanhao.provider.mapper;

import com.ruanhao.provider.entity.IicEuserAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IicEuserAdminMapper {
    //int deleteByPrimaryKey(Long userId);

//    int insert(IicEuserAdmin record);
//
//    int insertSelective(IicEuserAdmin record);

    IicEuserAdmin selectByPrimaryKey(@Param("userId") Long userId);

    List<IicEuserAdmin> getInPutUser();

//    int updateByPrimaryKeySelective(IicEuserAdmin record);
//
//    int updateByPrimaryKey(IicEuserAdmin record);
}