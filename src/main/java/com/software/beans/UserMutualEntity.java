package com.software.beans;

/**
 * 按时段统计用户访问次数
 */
public class UserMutualEntity {

    private String merchant_id;

    private String user_id;

    private String gender;

    private String age_range;

    private String one_clicks_times;

    private String shopping_carts_times;

    private String purchase_times;

    private String favourite_times;

    private String total_logs;

    public String getUserId() { return user_id;}

    public String getMerchantId() { return merchant_id;}

    public String getUserGender() {
        return gender;
    }

    public String getOneClicksTimes() { return one_clicks_times;}

    public String getShoppingCartsTimes() { return shopping_carts_times;}

    public String getPurchaseTimes() { return purchase_times;}

    public String getFavouriteTimes() { return favourite_times;}

    public String getAgeRange() { return age_range;}

    public String getTotalLogs() { return total_logs;}

    public void setUserId(String user_id) {this.user_id = user_id;}

    public void setMerchantId(String merchant_id) { this.merchant_id = merchant_id;}

    public void setUserNum(String userNum) {
        this.gender = gender;
    }

    public void setOneClicksTimes(String one_clicks_times) {
        this.one_clicks_times = one_clicks_times;
    }

    public void setShoppingCartsTimes(String shopping_carts_time) { this.shopping_carts_times = shopping_carts_time;}

    public void setPurchaseTimes(String purchase_times) { this.purchase_times = purchase_times;}

    public void setFavouriteTimes(String favourite_times) { this.favourite_times = favourite_times;}

    public void setAgeRange(String age_range) { this.age_range = age_range;}

    public void setTotalLogs(String total_logs) {this.total_logs = total_logs;}
}