package com.software.dao;

import com.software.beans.UserMutualEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMutualEntityMapper {

   //查询用户性别
   List<Map<String,Object>> queryUserGender();

   //查询用户行为
   List<UserMutualEntity> queryUserAction();

   //查询用户年龄
   List<Map<String,Object>> queryUserAge();
}