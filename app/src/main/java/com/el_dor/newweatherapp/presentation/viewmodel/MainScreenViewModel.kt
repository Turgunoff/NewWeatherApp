package com.el_dor.newweatherapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.el_dor.newweatherapp.App
import com.el_dor.newweatherapp.data.domain.Repository
import com.el_dor.newweatherapp.data.weather_api.entities.MainResponseObject

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
class MainScreenViewModel : ViewModel() {

    private var repository: Repository = App.instance!!.repository

    private var weatherMutableLiveData = MutableLiveData<MainResponseObject>()
    private var errorMutableLiveData = MutableLiveData<String>()

    val weatherLiveData: LiveData<MainResponseObject>
        get() = weatherMutableLiveData

    val errorLiveData: LiveData<String>
        get() = errorMutableLiveData

    fun getWeatherFromApi(latitude: String, longitude: String) {
        repository.getWeatherFromApi(
            latitude,
            longitude,
            object : Repository.GetWeatherFromApiCallback {
                override fun onSuccess(weather: MainResponseObject?) {
                    weatherMutableLiveData.postValue(weather)
                }

                override fun onFailure(str: String) {
                    errorMutableLiveData.postValue(str)
                }
            })
    }
}