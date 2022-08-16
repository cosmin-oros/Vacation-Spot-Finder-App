package cosmin.dev.travelapp.ui.screens.cities_package

data class CitiesData(
    val imgRes: Int,
    val cityName: String,
    val country: String,
    //in order to check if its the first city to place the back button
    val firstCity: Int
)
