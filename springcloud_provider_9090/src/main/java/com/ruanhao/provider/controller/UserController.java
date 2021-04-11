package com.ruanhao.provider.controller;

import com.ruanhao.provider.constant.OutResConstant;
import com.ruanhao.provider.entity.IicEuserAdmin;
import com.ruanhao.provider.enumm.IICResEnum;
import com.ruanhao.provider.exception.IIcRuntimeException;
import com.ruanhao.provider.model.IICResponseModel;
import com.ruanhao.provider.req.QueryUserReq;
import com.ruanhao.provider.res.QueryUserRes;
import com.ruanhao.provider.service.IUserService;
import com.ruanhao.provider.util.GsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Ryan
 * @Date 2020/3/28 0028 18:51
 */
@RestController
@RequestMapping("/userC")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public IicEuserAdmin getUserById(@RequestParam(value = "userId") Long userId) throws ParseException {
        IicEuserAdmin userById;
        GsonUtils.GsonString(userId);
        try {
            userById = userService.getUserById(userId);
            return userById;
        }catch (Exception e){
            e.printStackTrace();
         }
        return null;
    }

    @RequestMapping("/dateFormat")
    @ResponseBody
    public Serializable dateFormat(QueryUserReq req){
        try {
            //日期转换演示
            DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
            DateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd");
            Date parse = dateFormat.parse(req.getCreatedDate());
            String dString = dateFormat1.format(parse);
            java.sql.Date date1 = java.sql.Date.valueOf(dString);
            return IICResponseModel.success(date1);
        }catch (Exception e){
            return new IIcRuntimeException(IICResEnum.FIELD_VALIDATE_FAIL).getCode();
        }
    }


    @PostMapping("/getInPutUser")
    @ResponseBody
    public Map<String,Object> getOutPutUser(){
        return getQueryUserRes();
    }

    //@Scheduled(cron = "0/10 * * * * ?")
    Map<String, Object> getQueryUserRes(){
        Map<String,Object> resultMap = new HashMap<>();
        QueryUserRes queryUserRes = new QueryUserRes();
        try {
            List<IicEuserAdmin> admins = userService.getInPutUser();
            for (IicEuserAdmin eusAdmin : admins) {
                queryUserRes.setUserDName(eusAdmin.getUserName());
                queryUserRes.setMobileDPhone(eusAdmin.getMobilePhone());
                queryUserRes.setUserBirthDday(eusAdmin.getUserBirthday());
                queryUserRes.setUserDSex(eusAdmin.getUserSex());
                queryUserRes.setCreatedDDate(eusAdmin.getCreatedDate());
                queryUserRes.setContryDName(OutResConstant.CONTRY_D_NAME);
                Integer resB = userService.saveInPutUser(queryUserRes);
                resultMap.put("resB",resB);
                resultMap.put("E00000000", IICResEnum.SUCCESS);
            }
        }catch (Exception e){
            resultMap.put("E00000001", IICResEnum.FAILED);
        }
        return resultMap;
    }

}
