package com.ruanhao.provider.res;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Ryan
 * @Date 2020/3/15 0015 18:34
 */
@Setter
@Getter
public class QueryAdminUserManageListRes {
        /** * 用户ID */
        private String userId;
        /** * 用户姓名 */
        private String userName;
        /** * 角色ID列表 */
       // private List<AdminBaseRoleBo> roleList;
        /** * 移动电话 */
        private String mobileNoDesen;
        /** * 手机号码区号 */
        private String mobileNoPreCode;
        /** * 提交时间 */
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date createdDate;
        /** * 用户状态（0-草稿 1-已生效 2-
         *  3-已删除） */
        private String status;
        /** * 用户状态名称 */
/*
        private String statusDesc;
*/

}
