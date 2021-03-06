package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * 省级数据表
 */
public class Province extends LitePalSupport {
    /**
     *字段名
     */
    private int id;
    /**
     * 省名
     */
    private String provinceName;
    /**
     * 省的代号
     */
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
