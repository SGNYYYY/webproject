package com.software.controller;

import com.software.beans.HttpResponseEntity;
import com.software.common.Constans;
import com.software.beans.UserMutualEntity;
import com.software.dao.UserMutualEntityMapper;
import com.software.service.UserMutualService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by administrator
 */
@RestController
public class UserMutualController {

    private final Logger logger = LoggerFactory.getLogger(UserMutualController.class);

    @Autowired
    private UserMutualService userMutualService;


    /**
     * 查询用户性别
     * @param
     * @return
     */
    @RequestMapping(value = "/queryUserGender")
    public HttpResponseEntity queryUserGender() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String,Object>> result = userMutualService.queryUserGender();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    /**
     * 查询用户行为
     */
    @RequestMapping(value = "/queryUserAction")
    public HttpResponseEntity queryUserAction() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<UserMutualEntity> result = userMutualService.queryUserAction();
        httpResponseEntity.setCode((Constans.SUCCESS_CODE));
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    /**
     * 查询用户年龄
     */
    @RequestMapping(value = "/queryUserAge")
    public HttpResponseEntity queryUserAge() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryUserAge();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

}
