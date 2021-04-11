package com.ruanhao.provider.mapper;

import com.ruanhao.provider.res.QueryUserRes;
import org.springframework.stereotype.Component;

/**
 * @author Ryan
 * @Date 2021/4/4 0004 9:59
 */
@Component
public interface OutUserMapper {
    int saveInPutUser(QueryUserRes res);
}
