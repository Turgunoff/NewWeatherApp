package com.el_dor.newweatherapp.presentation.dialogs

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.el_dor.newweatherapp.R
import com.el_dor.newweatherapp.data.db.entities.City
import com.el_dor.newweatherapp.presentation.viewmodel.CitiesListViewModel

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
class CityAddDialog(
    context: Context,
    private val viewModel: CitiesListViewModel
) :
    Dialog(context) {

    private lateinit var cityNameEdt: EditText
    private lateinit var latitudeEdt: EditText
    private lateinit var longitudeEdt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_add_city)
        initFields()

        findViewById<View>(R.id.apply_add_city_btn).setOnClickListener {
            validateFieldsAndAddCity()
        }

        findViewById<View>(R.id.cancel_add_city_btn).setOnClickListener {
            onBackPressed()
        }
    }

    private fun validateFieldsAndAddCity() {
        val name = cityNameEdt.getText().toString()
        val latitude = latitudeEdt.getText().toString()
        val longitude = longitudeEdt.getText().toString()

        var str: String

        if (name != "" && latitude != "" && longitude != "") {
            val city = City(
                name,
                latitude,
                longitude
            )

            viewModel.insertCityToDb(city)
            str = "${city.name} добавлен в список"
            onBackPressed()

        } else {
            str = "Заполните все поля!"
        }
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }

    private fun initFields() {
        cityNameEdt = findViewById(R.id.add_city_name_edt)
        latitudeEdt = findViewById(R.id.add_latitude_edt)
        longitudeEdt = findViewById(R.id.add_longitude_edt)
    }
}