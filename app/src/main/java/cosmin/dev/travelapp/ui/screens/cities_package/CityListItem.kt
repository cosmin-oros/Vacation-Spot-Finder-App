package cosmin.dev.travelapp.ui.screens.cities_package

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController

@Composable
fun CityListItem(citiesData: CitiesData, navController: NavController, name: String?) {
    if (citiesData.country == name){
        ImageCard(
            painter = painterResource(id = citiesData.imgRes),
            contentDescription = citiesData.cityName
        )
    }
}