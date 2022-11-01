package com.el_dor.newweatherapp.data.domain

import com.el_dor.newweatherapp.App
import com.el_dor.newweatherapp.data.db.entities.City
import com.el_dor.newweatherapp.data.weather_api.WeatherApiService.Companion.UNITS
import com.el_dor.newweatherapp.data.weather_api.entities.MainResponseObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
class Repository {

    private val dao by lazy { App.instance!!.database.citiesDao() }
    private val api by lazy { App.instance?.apiService!! }

    fun insertCityToDb(city: City) {
        dao.insertCity(city)
    }

    fun getAllCitiesFromDb(): List<City> {
        return dao.getAllCities()
    }

    fun getSameNameCitiesFromDb(str: String): List<City> {
        val queryContainStr = "%$str%"
        return dao.getSameNameCities(queryContainStr)
    }

    fun deleteCityFromDb(city: City) {
        dao.deleteCity(city)
    }

    fun getWeatherFromApi(
        latitude: String,
        longitude: String,
        callback: GetWeatherFromApiCallback
    ) {
        api.getWeather(latitude, longitude, UNITS)
            .enqueue(object : Callback<MainResponseObject> {
                override fun onFailure(call: Call<MainResponseObject>, t: Throwable) {
                    callback.onFailure(t.message.toString())
                }

                override fun onResponse(
                    call: Call<MainResponseObject>,
                    response: Response<MainResponseObject>
                ) {
                    if (response.isSuccessful) {
                        callback.onSuccess(response.body())
                    } else {
                        callback.onFailure("Response error code: ${response.code()}")
                    }
                }
            })
    }

    interface GetWeatherFromApiCallback {
        fun onSuccess(weather: MainResponseObject?)
        fun onFailure(str: String)
    }
}