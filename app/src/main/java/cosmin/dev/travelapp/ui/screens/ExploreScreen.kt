package cosmin.dev.travelapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cosmin.dev.travelapp.ui.screens.countries_package.CountryListItem
import cosmin.dev.travelapp.ui.screens.countries_package.ListOfCountries

@Composable
fun ExploreScreen(navController: NavController, name: String?) {
    val countriesList = remember{
        ListOfCountries.getData()
    }

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