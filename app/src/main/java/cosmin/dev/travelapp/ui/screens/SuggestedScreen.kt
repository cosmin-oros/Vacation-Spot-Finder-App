package cosmin.dev.travelapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import cosmin.dev.travelapp.ui.screens.countries_package.ListOfCountries

@Composable
fun SuggestedScreen(navController: NavController, name: String?) {
    val countriesList = remember{
        ListOfCountries.getData()
    }
}