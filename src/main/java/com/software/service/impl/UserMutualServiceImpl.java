package com.software.service.impl;

import com.software.beans.UserMutualEntity;
import com.software.dao.UserMutualEntityMapper;
import com.software.service.UserMutualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by administrator
 */
@Service
public class UserMutualServiceImpl implements UserMutualService {

    @Autowired
    private UserMutualEntityMapper userMutualEntityMapper;

    /**
     * 查询用户性别
     *
     * @return
     */
    public List<Map<String,Object>> queryUserGender() {
        return userMutualEntityMapper.queryUserGender();
    }

    /**
     * 查询用户行为
     * @return
     */
    public List<UserMutualEntity> queryUserAction() {
        return userMutualEntityMapper.queryUserAction();
    }

    /**
     * 查询用户年龄
     * @return
     */
    public List<Map<String, Object>> queryUserAge() {
        return userMutualEntityMapper.queryUserAge();
    }
}
