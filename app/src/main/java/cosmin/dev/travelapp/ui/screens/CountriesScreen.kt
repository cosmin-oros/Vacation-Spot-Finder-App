package cosmin.dev.travelapp.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun CountriesScreen(navController: NavController, name: String?) {
    if (name != null) {
        Text(text = name)
    }
}