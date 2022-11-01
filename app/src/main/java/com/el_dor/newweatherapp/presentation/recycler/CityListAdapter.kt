package com.el_dor.newweatherapp.presentation.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.el_dor.newweatherapp.R
import com.el_dor.newweatherapp.data.db.entities.City

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
class CityListAdapter(var cityClickListener: CityClickListener) : RecyclerView.Adapter<CityListAdapter.CityViewHolder>() {

    private var cityList: List<City> = ArrayList()

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): CityViewHolder {
        return CityViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_city, viewGroup, false)
        )
    }

    override fun onBindViewHolder(cityViewHolder: CityViewHolder, i: Int) {
        val cityItem = cityList[i]
        cityViewHolder.bind(cityViewHolder.itemView, cityItem, cityClickListener, i)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    fun setData(cityList: List<City>) {
        this.cityList = cityList
        notifyDataSetChanged()
    }

    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var cityName: TextView

        fun bind(
            itemView: View,
            city: City,
            cityClickListener: CityClickListener,
            position: Int
        ) {
            cityName.text = city.name
            itemView.setOnClickListener(cityClickListener.onCityClickListener(city))
            itemView.setOnLongClickListener(cityClickListener.onCityLongClickListener(position, city))
        }

        init {
            cityName = itemView.findViewById(R.id.item_city_name)
        }
    }
}