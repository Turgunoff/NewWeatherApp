package com.el_dor.newweatherapp.data.weather_api

import com.el_dor.newweatherapp.data.weather_api.entities.MainResponseObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
interface WeatherApiService {

    companion object {
        const val BASE_URL = "https://api.darksky.net/forecast/" //базовый урл
        const val UNITS = "si" //параметр для получения данных в системе СИ
        const val API_ACCESS_KEY = "f5483d10bb2fca550ed960234826950f" //API_ACCESS_KEY
    }

    @GET("{latitude},{longitude}")
    fun getWeather(
        @Path("latitude") latitude: String?,
        @Path("longitude") longitude: String?,
        @Query("units") units: String?
    ): Call<MainResponseObject>
}