package com.software.service;

import com.software.beans.UserMutualEntity;

import java.util.List;
import java.util.Map;

/**
 * 功能：业务逻辑层实现项目的增删改查操作
 */
public interface UserMutualService {

    /**
     * 查询用户性别
     * @return
     */
    public List<Map<String,Object>> queryUserGender();

    /**
     * 查询用户行为
     * @return list[0]:oneClicks list[1]:shoppingCarts list[2]:purchase_times list[3]:favourite_times
     */
    public List<UserMutualEntity> queryUserAction();

    /**
     * 查询用户年龄
     * @return
     */
    public List<Map<String, Object>> queryUserAge();
}
