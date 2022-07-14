package com.software.dao;

import com.software.beans.UserMutualEntity;
import org.apache.catalina.User;
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

   List<UserMutualEntity> querySellerAction();

   List<UserMutualEntity> queryUserActionTop5();

   List<Map<String,Object>> queryUserTotalLogs();

   List<Map<String,Object>> queryUserOneClicks();

   List<Map<String,Object>> queryUserShoppingCarts();

   List<Map<String,Object>> queryUserPurchaseTimes();

   List<Map<String,Object>> queryUserFavouriteTimes();

   List<Map<String,Object>> queryUserBrowseDays();

   List<Map<String,Object>> querySellerTop10Label();

   List<Map<String,Object>> queryNum();

   List<Map<String,Object>> queryGenderLabel();

   List<Map<String,Object>> queryAgeLabel();

   List<Map<String,Object>> queryUserTop10Label();
}