package com.coolweather.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/18.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weathereId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeathereId() {
        return weathereId;
    }

    public void setWeathereId(String weathereId) {
        this.weathereId = weathereId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
