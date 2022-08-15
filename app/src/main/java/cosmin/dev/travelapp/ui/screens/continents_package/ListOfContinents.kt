package cosmin.dev.travelapp.ui.screens.continents_package

import cosmin.dev.travelapp.R

object ListOfContinents{
    fun getData(): ArrayList<ContinentsData>{
        return arrayListOf(
            ContinentsData(
                imgRes = R.drawable.africa,
                continentName = "Africa",
                info = "54 countries"
            ),
            ContinentsData(
                imgRes = R.drawable.asia,
                continentName = "Asia",
                info = "47 countries"
            ),
            ContinentsData(
                imgRes = R.drawable.europe,
                continentName = "Europe",
                info = "44 countries"
            ),
            ContinentsData(
                imgRes = R.drawable.northamerica,
                continentName = "North America",
                info = "23 countries"
            ),
            ContinentsData(
                imgRes = R.drawable.oceania,
                continentName = "Oceania",
                info = "13 countries"
            ),
            ContinentsData(
                imgRes = R.drawable.southamerica,
                continentName = "South America",
                info = "12 countries"
            )
        )
    }
}