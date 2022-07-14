package com.software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前端控制器 :首页
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String gotoLogin(){
        //return "pages/login.html";
        //return "pages/productresultpage1.html";
        return "pages/login.html";
    }
    @RequestMapping(value = "/index")
    public String gotoIndex(){
        //return "pages/login.html";
        return "pages/index.html";
    }
    @RequestMapping(value = "/pieGender")
    public String gotoPieGender(){
        //return "pages/login.html";
        return "pages/pieGender.html";
    }
    @RequestMapping(value = "/barAge")
    public String gotoBarAge(){
        //return "pages/login.html";
        return "pages/barAge.html";
    }

    @RequestMapping(value = "/top10SellerLabel")
    public String gotoTop10SellerLabel(){
        //return "pages/login.html";
        return "pages/top10SellerLabel.html";
    }
    @RequestMapping(value = "/top10SellerMutual")
    public String gotoTop10SellerMutual(){
        //return "pages/login.html";
        return "pages/top10SellerMutual.html";
    }
    @RequestMapping(value = "/top10UserAction")
    public String gotoTop10UserAction(){
        //return "pages/login.html";
        return "pages/top10UserAction.html";
    }
    @RequestMapping(value = "/userAction")
    public String gotoUserAction(){
        //return "pages/login.html";
        return "pages/userAction.html";
    }
    @RequestMapping(value = "/userBrowseDays")
    public String gotoUserBrowseDays(){
        //return "pages/login.html";
        return "pages/userBrowseDays.html";
    }
    @RequestMapping(value = "/userOneClicks")
    public String gotoUserOneClicks(){
        //return "pages/login.html";
        return "pages/userOneClicks.html";
    }
    @RequestMapping(value = "/userShoppingCarts")
    public String gotoUserShoppingCarts(){
        //return "pages/login.html";
        return "pages/userShoppingCarts.html";
    }
    @RequestMapping(value = "/userPurchaseTimes")
    public String gotoUserPurchaseTimes(){
        //return "pages/login.html";
        return "pages/userPurchaseTimes.html";
    }
    @RequestMapping(value = "/userFavouriteTimes")
    public String gotoUserFavouriteTimes(){
        //return "pages/login.html";
        return "pages/userFavouriteTimes.html";
    }
    @RequestMapping(value = "/userTotalLogs")
    public String gotoUserTotalLogs(){
        //return "pages/login.html";
        return "pages/userTotalLogs.html";
    }

    @RequestMapping(value = "/userGenderLabel")
    public String gotoUserGenderLabel(){
        //return "pages/login.html";
        return "pages/userGenderLabel.html";
    }
    @RequestMapping(value = "/userAgeLabel")
    public String gotoUserAgeLabel(){
        //return "pages/login.html";
        return "pages/userAgeLabel.html";
    }
    @RequestMapping(value = "/top10UserLabel")
    public String gotoTop10UserLabel(){
        //return "pages/login.html";
        return "pages/top10UserLabel.html";
    }
    @RequestMapping(value = "/1")
    public String gotoUserMutual(){
        //return "pages/login.html";
        return "pages/productresultpage2.html";
        //return "pages/userMutual.html";
    }
}
