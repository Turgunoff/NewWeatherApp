package com.el_dor.newweatherapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.el_dor.newweatherapp.App
import com.el_dor.newweatherapp.data.db.entities.City
import com.el_dor.newweatherapp.data.domain.Repository

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
class CitiesListViewModel : ViewModel() {
    private var repository: Repository = App.instance!!.repository

    private var citiesMutableLiveData = MutableLiveData<List<City>>()

    val citiesLiveData: LiveData<List<City>>
        get() = citiesMutableLiveData

    fun getAllCitiesFromDb() {
        citiesMutableLiveData.postValue(repository.getAllCitiesFromDb())
    }

    fun getSameNameCitiesFromDb(str: String) {
        citiesMutableLiveData.postValue(repository.getSameNameCitiesFromDb(str))
    }

    fun insertCityToDb(city: City) {
        repository.insertCityToDb(city)
        getAllCitiesFromDb()
    }

    fun deleteCityFromDb(city: City) {
        repository.deleteCityFromDb(city)
        getAllCitiesFromDb()
    }
}