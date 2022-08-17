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
            ),
            CitiesData(
                imgRes = R.drawable.luanda,
                cityName = "Luanda",
                country = "Angola",
                continent = "Africa",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.kissama,
                cityName = "Kissama National Park",
                country = "Angola",
                continent = "Africa",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.stjohns,
                cityName = "St. John's",
                country = "Antigua and Barbuda",
                continent = "North America",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.englishharbour,
                cityName = "English Harbour",
                country = "Antigua and Barbuda",
                continent = "North America",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.buenosaires,
                cityName = "Buenos Aires",
                country = "Argentina",
                continent = "South America",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.mendoza,
                cityName = "Mendoza",
                country = "Argentina",
                continent = "South America",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.ushuaia,
                cityName = "Ushuaia",
                country = "Argentina",
                continent = "South America",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.cordoba,
                cityName = "Cordoba",
                country = "Argentina",
                continent = "South America",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.rosario,
                cityName = "Rosario",
                country = "Argentina",
                continent = "South America",
                firstCity = 0
            )
        )
    }
}