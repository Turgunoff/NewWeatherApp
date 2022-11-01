package com.el_dor.newweatherapp

import android.app.Application
import android.content.ContentValues
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.el_dor.newweatherapp.data.CitiesArrayData
import com.el_dor.newweatherapp.data.db.CitiesDb
import com.el_dor.newweatherapp.data.domain.Repository
import com.el_dor.newweatherapp.data.weather_api.WeatherApiService
import com.el_dor.newweatherapp.data.weather_api.WeatherApiService.Companion.API_ACCESS_KEY
import com.el_dor.newweatherapp.data.weather_api.WeatherApiService.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
class App : Application() {

    lateinit var apiService: WeatherApiService
    lateinit var database: CitiesDb
    val repository: Repository = Repository()

    companion object {
        var instance: App? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        initRetrofit()
        initDatabase()
    }

    private fun initRetrofit() {
        apiService = Retrofit.Builder()
            .baseUrl("$BASE_URL$API_ACCESS_KEY/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherApiService::class.java)
    }

    private fun initDatabase() {
        database = Room.databaseBuilder(applicationContext, CitiesDb::class.java, "cities_db")
            .fallbackToDestructiveMigration()
            .addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    //при самом первом запуске, добавляем города в базу из списка
                    for (i in 0 until CitiesArrayData.getCitiesArrayList().size) {
                        val city = CitiesArrayData.getCitiesArrayList().get(i)
                        val contentValues = ContentValues()
                        contentValues.put("name", city.name);
                        contentValues.put("latitude", city.latitude);
                        contentValues.put("longitude", city.longitude);
                        db.insert("Cities", 0, contentValues)
                    }
                }
            })
            .allowMainThreadQueries()
            .build()
    }
}