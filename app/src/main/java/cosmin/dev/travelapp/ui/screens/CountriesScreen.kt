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
import cosmin.dev.travelapp.ui.screens.countries_package.CountryListItem
import cosmin.dev.travelapp.ui.screens.countries_package.ListOfCountries

@Composable
fun CountriesScreen(navController: NavController, name: String?) {
    if (name != null) {
        Text(text = name)
    }
    val countriesList = remember{
        ListOfCountries.getData()
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //navigate back to the main screen button
        Button(
            onClick = {
                navController.navigate(Screen.MainScreen.route)
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Color.LightGray

            ),
            modifier = Modifier
                .padding(8.dp)
                .border(
                    width = 5.dp,
                    brush = Brush.horizontalGradient(listOf(Color.Cyan, Color.Blue)),
                    shape = RoundedCornerShape(15.dp)
                )
                .width(75.dp)
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Transparent
                        ),
                        startX = 150f
                    )
                )
        ) {
            Text(text = "Go back", fontSize = 8.sp)
        }

    }

    //list all the countries
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = countriesList,
            itemContent = {
                CountryListItem(countriesData = it, navController)
            }
        )
    }
}