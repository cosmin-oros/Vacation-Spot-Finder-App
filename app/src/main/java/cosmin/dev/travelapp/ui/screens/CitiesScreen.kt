package cosmin.dev.travelapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cosmin.dev.travelapp.ui.screens.cities_package.CitiesData
import cosmin.dev.travelapp.ui.screens.cities_package.CityListItem
import cosmin.dev.travelapp.ui.screens.cities_package.ImageCard
import cosmin.dev.travelapp.ui.screens.cities_package.ListOfCities
import cosmin.dev.travelapp.ui.screens.countries_package.CountryListItem

@Composable
fun CitiesScreen(navController: NavController, name: String?) {
    val citiesList = remember{
        ListOfCities.getData()
    }

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = citiesList,
            itemContent = {
                CityListItem(citiesData = it, navController, name)
            }
        )
    }

}

