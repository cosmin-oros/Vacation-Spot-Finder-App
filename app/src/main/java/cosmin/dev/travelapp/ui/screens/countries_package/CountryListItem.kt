package cosmin.dev.travelapp.ui.screens.countries_package

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cosmin.dev.travelapp.navigation.Screen
import cosmin.dev.travelapp.ui.screens.continents_package.ContinentImage

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CountryListItem(countriesData: CountriesData, navController: NavController, name: String?) {
    if (countriesData.continent == name) {

        if (countriesData.country == "Algeria" || countriesData.country == "Afghanistan" ||
                countriesData.country == "Albania" || countriesData.country == "Antigua and Barbuda" ||
                countriesData.country == "Australia" || countriesData.country == "Argentina"){
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
                            brush = Brush.horizontalGradient(listOf(Color.DarkGray, Color.LightGray)),
                            shape = RoundedCornerShape(15.dp)
                        )
                        .width(90.dp)
                        .height(40.dp)
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
                    Text(text = "Go back", fontSize = 12.sp)
                }

            }
            
            Spacer(modifier = Modifier.height(16.dp))
        }
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
            ) {
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
}