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

    /**
     * 查询销量数top5商家交互情况
     * @return
     */
    public List<UserMutualEntity> querySellerAction() {return userMutualEntityMapper.querySellerAction();}

    /**
     * 查询购买数Top5的用户
     * @return
     */
    public List<UserMutualEntity> queryUserActionTop5() {return userMutualEntityMapper.queryUserActionTop5();}

    /**
     * 查询交互数1-80对应的用户数量
     * @return
     */
    public List<Map<String, Object>> queryUserTotalLogs() {return userMutualEntityMapper.queryUserTotalLogs();}

    /**
     * 用户单击次数统计
     * @return
     */
    public List<Map<String, Object>> queryUserOneClicks() {return userMutualEntityMapper.queryUserOneClicks();}

    /**
     * 用户加购次数统计
     * @return
     */
    public List<Map<String,Object>> queryUserShoppingCarts() {return userMutualEntityMapper.queryUserShoppingCarts();}

    /**
     * 用户购买次数统计
     * @return
     */
    public List<Map<String,Object>> queryUserPurchaseTimes() {return userMutualEntityMapper.queryUserPurchaseTimes();}

    /**
     * 用户收藏次数统计
     * @return
     */
    public List<Map<String,Object>> queryUserFavouriteTimes() {return userMutualEntityMapper.queryUserFavouriteTimes();}

    public List<Map<String,Object>> queryUserBrowseDays() {return userMutualEntityMapper.queryUserBrowseDays();}

    public List<Map<String,Object>> querySellerTop10Label() {return userMutualEntityMapper.querySellerTop10Label();}

    public List<Map<String,Object>> queryNum() {return userMutualEntityMapper.queryNum();}

    public List<Map<String,Object>> queryGenderLabel() {return userMutualEntityMapper.queryGenderLabel();}

    public List<Map<String,Object>> queryAgeLabel() {return userMutualEntityMapper.queryAgeLabel();}

    public List<Map<String,Object>> queryUserTop10Label() {return userMutualEntityMapper.queryUserTop10Label();}
}
