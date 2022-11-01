package com.el_dor.newweatherapp.data.db

import androidx.room.*
import com.el_dor.newweatherapp.data.db.entities.City

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
@Dao
interface CitiesDao {

    @Query("SELECT * FROM Cities")
    fun getAllCities(): List<City>

    @Query("SELECT * FROM Cities WHERE name LIKE :str")
    fun getSameNameCities(str: String): List<City>

    @Insert
    fun insertCities(cities: List<City>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCity(city: City)

    @Delete
    fun deleteCity(city: City)
}