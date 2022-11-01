package com.el_dor.newweatherapp.presentation.recycler

import android.view.View
import com.el_dor.newweatherapp.data.db.entities.City

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
interface CityClickListener {
    fun onCityClickListener(city: City): View.OnClickListener
    fun onCityLongClickListener(position: Int, city: City): View.OnLongClickListener
}