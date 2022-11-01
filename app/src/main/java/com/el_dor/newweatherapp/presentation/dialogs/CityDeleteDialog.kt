package com.el_dor.newweatherapp.presentation.dialogs

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.el_dor.newweatherapp.R
import com.el_dor.newweatherapp.data.db.entities.City
import com.el_dor.newweatherapp.presentation.viewmodel.CitiesListViewModel

/**
 * Created by Eldor Turgunov.
 * New Weather App
 * eldorturgunov777@gmail.com
 */
class CityDeleteDialog(
    context: Context,
    private val viewModel: CitiesListViewModel,
    private val city: City
) :
    Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_delete_city)
        findViewById<View>(R.id.apply_delete_city_btn).setOnClickListener {
            viewModel.deleteCityFromDb(city)

            Toast.makeText(
                context,
                "${city.name} удален из списка", Toast.LENGTH_SHORT
            ).show()

            onBackPressed()
        }
        findViewById<View>(R.id.cancel_delete_city_btn).setOnClickListener { onBackPressed() }
    }
}