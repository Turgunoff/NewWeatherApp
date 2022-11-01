package com.el_dor.newweatherapp.data;

import com.el_dor.newweatherapp.data.db.entities.City;

import java.util.ArrayList;

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
public class CitiesArrayData {

    private static ArrayList<City> citiesArrayList;

    public static ArrayList<City> getCitiesArrayList() {
        if (citiesArrayList == null) {
            citiesArrayList = new ArrayList<>();
            citiesArrayList.add(new City("Санкт-Петербург", "59.939095", "30.315868"));
            citiesArrayList.add(new City("Москва", "55.755773", "37.617761"));
            citiesArrayList.add(new City("Новосибирск", "55.028739", "82.906928"));
            citiesArrayList.add(new City("Екатеринбург", "56.838002", "60.597295"));
            citiesArrayList.add(new City("Нижний Новгород", "56.323902", "44.002267"));
            citiesArrayList.add(new City("Казань", "55.795793", "49.106585"));
            citiesArrayList.add(new City("Челябинск", "55.159774", "61.402455"));
            citiesArrayList.add(new City("Омск", "54.989342", "73.368212"));
            citiesArrayList.add(new City("Самара", "53.195533", "50.101801"));
            citiesArrayList.add(new City("Ростов-на-Дону", "47.227151", "39.744972"));
            citiesArrayList.add(new City("Уфа", "54.734768", "55.957838"));
            citiesArrayList.add(new City("Красноярск", "56.008691", "92.870529"));
            citiesArrayList.add(new City("Воронеж", "51.661535", "39.200287"));
            citiesArrayList.add(new City("Пермь", "58.004785", "56.237654"));
            citiesArrayList.add(new City("Волгоград", "48.707103", "44.516939"));
            citiesArrayList.add(new City("Хельсинки", "60.169520", "24.935450"));
            citiesArrayList.add(new City("Стокгольм", "59.332580", "18.064900"));
            citiesArrayList.add(new City("Осло", "59.912730", "10.746090"));
        }
        return citiesArrayList;
    }
}
