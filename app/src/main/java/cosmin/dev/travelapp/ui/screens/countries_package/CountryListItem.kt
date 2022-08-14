package cosmin.dev.travelapp.ui.screens.countries_package

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cosmin.dev.travelapp.navigation.Screen
import cosmin.dev.travelapp.ui.screens.continents_package.ContinentImage

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CountryListItem(countriesData: CountriesData, navController: NavController) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.DarkGray,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        onClick = {
            //need to pass an argument to know what continent its on
            /*navController.navigate(Screen.CitiesScreen.withArgs(countriesData.country))*/
        }
    ){
        Row {
            CountryImage(countriesData = countriesData)

            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = countriesData.country, style = MaterialTheme.typography.h6)
                Text(text = countriesData.capital, style = MaterialTheme.typography.caption)
                //insert a bar for safety
            }

        }
    }
}