package com.ruanhao.provider.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import com.ruanhao.provider.model.IICResponseModel;
import com.ruanhao.provider.req.QueryAdminUserManageListReq;
import com.ruanhao.provider.res.QueryAdminUserManageListRes;
import com.ruanhao.provider.service.AdminUserManageService;
import com.ruanhao.provider.util.GsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ken
 * @Time 2018/12/7 10:32
 * @Version 1.0
 */
@RestController
@RequestMapping("/adminUserManage")
@Slf4j
public class AdminUserManageController{

    @Autowired
    UserController userController;
    /**
     * 演示调用数据1
     *
     * @return*/
    @RequestMapping("/queryAll")
    public IICResponseModel<Map<String, Object>> queryAll(){
        log.info("getQueryUserRes调用访问开始。。。 = {▆★★★★★★★}");
        Map<String, Object> userRes = userController.getQueryUserRes();
        log.info("getQueryUserRes调用访问结束。。。 = {▆★★★★★★★}"+userRes);
        return IICResponseModel.success(userRes);
    }

    /**
     * 演示调用数据2
     *
     * @return*/
    @RequestMapping("/queryUId")
    public IICResponseModel<Map<String, Object>> queryUId() throws JsonProcessingException {
        log.info("controller层访问开始。。。 = {▆★★★★★★★}");
        Map<String,Object> rmap = new HashMap<>();
        int userId = 1;
        //调用有返回数据类型的方法取到城市名称
            /*String userName = userController.getUserById((long) userId).getCityName();
            rmap.put("userName",userName);*/

        //Map<String, Object> userB = userController.getUserB();
        //rmap.put("cityName",userB);
        return IICResponseModel.success(rmap);
    }




    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello/{param}")
    public String hello(@PathVariable("param") String param){
        return "调用了提供者提供的服务，所传的参数为：" + param + " 提供者的端口：" + port;
    }
    @Autowired(required = false)
    private AdminUserManageService adminUserManageService;

    @RequestMapping("/queryAdminUserManageList")
    public IICResponseModel<PageInfo<QueryAdminUserManageListRes>> queryAdminUserManageList(
            @RequestHeader(value = "language") String language, @RequestBody @Validated QueryAdminUserManageListReq queryAdminUserManageListReq) {
        log.info("queryAdminUserManageList = {}", GsonUtils.GsonString(queryAdminUserManageListReq));
        log.info("language = {▆★★★★★★★}", language);
        PageInfo<QueryAdminUserManageListRes> result = adminUserManageService.queryAdminUserManageList(language, queryAdminUserManageListReq);
        return IICResponseModel.success(result);
    }

}
