package com.el_dor.newweatherapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.el_dor.newweatherapp.data.db.entities.City

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
@Database(entities = [(City::class)], version = 1)
abstract class CitiesDb : RoomDatabase() {

    abstract fun citiesDao(): CitiesDao
}