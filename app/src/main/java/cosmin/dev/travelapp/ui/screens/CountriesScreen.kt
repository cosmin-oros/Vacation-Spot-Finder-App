package cosmin.dev.travelapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cosmin.dev.travelapp.navigation.Screen
import cosmin.dev.travelapp.ui.screens.continents_package.ContinentListItem
import cosmin.dev.travelapp.ui.screens.continents_package.ListOfContinents
import cosmin.dev.travelapp.ui.screens.countries_package.CountriesData
import cosmin.dev.travelapp.ui.screens.countries_package.CountryListItem
import cosmin.dev.travelapp.ui.screens.countries_package.ListOfCountries

@Composable
fun CountriesScreen(navController: NavController, name: String?) {
    /*
    split 2 buttons Find Me A Location, Explore
    Find me a location - sort by continent, input budget, activities etc
     */

    //list all the countries
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = countriesList,
            itemContent = {
                CountryListItem(countriesData = it, navController, name)
            }
        )
    }
}
