package com.el_dor.newweatherapp.data.weather_api.entities;

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
public class MainResponseObject {
    private String latitude;
    private String longitude;
    private String timezone;
    private DetailInformation currently;
    // то что ниже - есть в доке, но я не использую
//    private minutely;
//    private hourly;
//    private daily;
//    private flags;
    private String offset;

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setCurrently(DetailInformation currently) {
        this.currently = currently;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public DetailInformation getCurrently() {
        return currently;
    }

    public String getOffset() {
        return offset;
    }
}