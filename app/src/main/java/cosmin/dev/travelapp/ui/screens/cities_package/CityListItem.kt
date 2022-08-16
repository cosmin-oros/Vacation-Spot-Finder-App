package cosmin.dev.travelapp.ui.screens.cities_package

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cosmin.dev.travelapp.navigation.Screen

@Composable
fun CityListItem(citiesData: CitiesData, navController: NavController, name: String?) {
    if (citiesData.country == name){

        if (citiesData.firstCity == 1){
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
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color.DarkGray,
                                    Color.LightGray
                                )
                            ),
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

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            ImageCard(
                painter = painterResource(id = citiesData.imgRes),
                contentDescription = citiesData.cityName
            )
        }
    }
}