package com.el_dor.newweatherapp.data.weather_api.entities;

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
public class DetailInformation {
    private String time;
    private String summary;
    private String icon;
    private String nearestStormDistance;
    private String nearestStormBearing;
    private String precipIntensity;
    private String precipProbability;
    private String temperature;
    private String apparentTemperature;
    private String dewPoint;
    private String humidity;
    private String pressure;
    private String windSpeed;
    private String windGust;
    private String windBearing;
    private String cloudCover;
    private String uvIndex;
    private String visibility;
    private String ozone;


    public void setTime(String time) {
        this.time = time;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setNearestStormDistance(String nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public void setNearestStormBearing(String nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public void setPrecipIntensity(String precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public void setPrecipProbability(String precipProbability) {
        this.precipProbability = precipProbability;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public void setDewPoint(String dewPoint) {
        this.dewPoint = dewPoint;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setWindGust(String windGust) {
        this.windGust = windGust;
    }

    public void setWindBearing(String windBearing) {
        this.windBearing = windBearing;
    }

    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setOzone(String ozone) {
        this.ozone = ozone;
    }

    public String getTime() {
        return time;
    }

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public String getNearestStormDistance() {
        return nearestStormDistance;
    }

    public String getNearestStormBearing() {
        return nearestStormBearing;
    }

    public String getPrecipIntensity() {
        return precipIntensity;
    }

    public String getPrecipProbability() {
        return precipProbability;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getApparentTemperature() {
        return apparentTemperature;
    }

    public String getDewPoint() {
        return dewPoint;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getWindGust() {
        return windGust;
    }

    public String getWindBearing() {
        return windBearing;
    }

    public String getCloudCover() {
        return cloudCover;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getOzone() {
        return ozone;
    }
}