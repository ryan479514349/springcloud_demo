package com.ruanhao.provider.controller;

import com.ruanhao.provider.constant.OutResConstant;
import com.ruanhao.provider.entity.IicEuserAdmin;
import com.ruanhao.provider.enumm.IICResEnum;
import com.ruanhao.provider.res.QueryUserRes;
import com.ruanhao.provider.service.IUserService;
import com.ruanhao.provider.util.GsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ryan
 * @Date 2020/3/28 0028 18:51
 * 示例代码演示
 */
@RestController
@RequestMapping("/demoThe")
@Slf4j
public class DemoThe {

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

    /**
     * 时间格式化演示
     * */
    @RequestMapping("/dateFormat")
    @ResponseBody
    public Map<String,Object> dateFormat(String createdDate){
        StringBuffer stringBuffer = new StringBuffer();
        Map<String,Object> dates = new HashMap<>();
        Boolean suss = true;
        try {
            //日期转换演示
            String format;
            if (createdDate.indexOf("-")>-1){
                format = "yyyy-MM-dd";
            }else if (createdDate.indexOf("/")>-1){
                format = "yyyy/MM/dd";
            }else {
                format = "yyyyMMdd";
            }
            //获取当前时间
            long curDate = System.currentTimeMillis();
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            Date parse = dateFormat.parse(createdDate);
            //格式化创建日期
            String createdDateFormat = dateFormat.format(parse);
            //格式化当前时间
            String curDateFormat = dateFormat.format(curDate);
            if (curDateFormat.compareTo(createdDateFormat)>0){
                stringBuffer.append("创建时间不能小于当前时间！");
                suss = false;
            }
            dates.put("createdDateFormat", createdDateFormat);
            dates.put("curDateFormat",curDateFormat);
            dates.put("stringBuffer",stringBuffer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dates;
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
