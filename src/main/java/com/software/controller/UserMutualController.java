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

    @RequestMapping(value = "/querySellerAction")
    public HttpResponseEntity querySellerAction() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<UserMutualEntity> result = userMutualService.querySellerAction();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryUserActionTop5")
    public HttpResponseEntity queryUserActionTop5() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<UserMutualEntity> result = userMutualService.queryUserActionTop5();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryUserTotalLogs")
    public HttpResponseEntity queryUserTotalLogs() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryUserTotalLogs();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryUserOneClicks")
    public HttpResponseEntity queryUserOneClicks() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryUserOneClicks();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryUserShoppingCarts")
    public HttpResponseEntity queryUserShoppingCarts() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryUserShoppingCarts();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryUserPurchaseTimes")
    public HttpResponseEntity queryUserPurchaseTimes() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryUserPurchaseTimes();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryUserFavouriteTimes")
    public HttpResponseEntity queryUserFavouriteTimes() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryUserFavouriteTimes();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryUserBrowseDays")
    public HttpResponseEntity queryUserBrowseDays() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryUserBrowseDays();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/querySellerTop10Label")
    public HttpResponseEntity querySellerTop10Label() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.querySellerTop10Label();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryNum")
    public HttpResponseEntity queryNum() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryNum();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryGenderLabel")
    public HttpResponseEntity queryGenderLabel() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryGenderLabel();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryAgeLabel")
    public HttpResponseEntity queryAgeLabel() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryAgeLabel();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

    @RequestMapping(value = "/queryUserTop10Label")
    public HttpResponseEntity queryUserTop10Label() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String, Object>> result = userMutualService.queryUserTop10Label();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }
}
