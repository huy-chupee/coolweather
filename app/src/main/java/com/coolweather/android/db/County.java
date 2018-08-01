package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherTd;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return getCountyName();
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherTd(){
        return weatherTd;
    }
    public void setWeatherTd(String weatherTd){
        this.weatherTd=weatherTd;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
