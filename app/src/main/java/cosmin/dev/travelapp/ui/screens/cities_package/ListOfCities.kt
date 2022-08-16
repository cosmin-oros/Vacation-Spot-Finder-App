package cosmin.dev.travelapp.ui.screens.cities_package

import cosmin.dev.travelapp.R

object ListOfCities {
    fun getData(): ArrayList<CitiesData>{
        return arrayListOf(
            CitiesData(
                imgRes = R.drawable.kabul,
                cityName = "Kabul",
                country = "Afghanistan",
                continent = "Asia",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.herat,
                cityName = "Herat",
                country = "Afghanistan",
                continent = "Asia",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.tirana,
                cityName = "Tirana",
                country = "Albania",
                continent = "Europe",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.durres,
                cityName = "Durres",
                country = "Albania",
                continent = "Europe",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.berat,
                cityName = "Berat",
                country = "Albania",
                continent = "Europe",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.algiers,
                cityName = "Algiers",
                country = "Algeria",
                continent = "Africa",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.annaba,
                cityName = "Annaba",
                country = "Algeria",
                continent = "Africa",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.oran,
                cityName = "Oran",
                country = "Algeria",
                continent = "Africa",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.andorralavella,
                cityName = "Andorra la Vella",
                country = "Andorra",
                continent = "Europe",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.pasdelacasa,
                cityName = "Pas de la Casa",
                country = "Andorra",
                continent = "Europe",
                firstCity = 0
            )
        )
    }
}