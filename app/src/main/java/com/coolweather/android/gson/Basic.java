package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    /**
     * 使用@SerializedName()注解的方式让JSON字段和java字段之间建立映射关系
     * 城市名
     */
    @SerializedName("city")
    public String cityName;

    /**
     * 城市对应的天气id
     */
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public  class Update{

        /**
         * 天气的更新时间
         */
        @SerializedName("loc")
        public String updataTime;
    }
}
