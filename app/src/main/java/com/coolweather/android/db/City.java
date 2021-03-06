package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * 市级数据表
 */
public class City extends LitePalSupport {
    /**
     * 字段名
     */
    private int id;
    /**
     * 记录市名
     */
    private String cityName;
    /**
     * 记录市的代号
     */
    private int cityCode;
    /**
     * 当前市所属的Id值
     */
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
