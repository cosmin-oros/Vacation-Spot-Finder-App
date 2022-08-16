package cosmin.dev.travelapp.ui.screens.cities_package

import cosmin.dev.travelapp.R

object ListOfCities {
    fun getData(): ArrayList<CitiesData>{
        return arrayListOf(
            CitiesData(
                imgRes = R.drawable.afghanistan,
                cityName = "Kabul",
                country = "Afghanistan"
            )
        )
    }
}