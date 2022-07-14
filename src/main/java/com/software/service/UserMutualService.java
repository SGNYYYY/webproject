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

    /**
     * 查询销量top5商家交互情况
     * @return
     */
    public List<UserMutualEntity> querySellerAction();

    /**
     * 查询购买数Top5的用户
     * @return
     */
    public List<UserMutualEntity> queryUserActionTop5();

    /**
     * 查询交互数1-80对应的用户数量
     * @return
     */
    public List<Map<String, Object>> queryUserTotalLogs();

    /**
     * 用户单击次数统计
     * @return
     */
    public List<Map<String, Object>> queryUserOneClicks();

    /**
     * 用户加购次数统计
     * @return
     */
    public List<Map<String,Object>> queryUserShoppingCarts();

    /**
     * 用户购买次数统计
     * @return
     */
    public List<Map<String,Object>> queryUserPurchaseTimes();

    /**
     * 用户收藏次数统计
     * @return
     */
    public List<Map<String,Object>> queryUserFavouriteTimes();

    /**
     * 用户浏览天数统计
     * @return
     */
    public List<Map<String,Object>> queryUserBrowseDays();

    /**
     * 销量Top10的商家的复购情况
     * @return
     */
    public List<Map<String,Object>> querySellerTop10Label();

    public List<Map<String,Object>> queryNum();

    /**
     * 性别与复购情况
     * @return
     */
    public List<Map<String,Object>> queryGenderLabel();

    public List<Map<String,Object>> queryAgeLabel();

    public List<Map<String,Object>> queryUserTop10Label();
}
