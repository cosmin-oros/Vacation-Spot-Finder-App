package cosmin.dev.travelapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
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
import cosmin.dev.travelapp.ui.screens.countries_package.DropDown
import cosmin.dev.travelapp.ui.screens.countries_package.ListOfCountries

@Composable
fun CountriesScreen(navController: NavController, name: String?) {
    /*
    split 2 buttons Find Me A Location, Explore
    Find me a location - sort by continent, input budget, activities etc
     */

    var DropdownSelectedState1 by remember{
        mutableStateOf("")
    }
    var DropdownSelectedState2 by remember{
        mutableStateOf("")
    }
    var DropdownSelectedState3 by remember{
        mutableStateOf("")
    }
    var DropdownSelectedState4 by remember{
        mutableStateOf("")
    }

    var cont: String = ""

    if (name != null){
        cont = name
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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.size(32.dp))

            // make the dropdown more narrow, make the contents clickable
            // make 3 choices for each

            // when you click on one of the choices of the
            // dropdown update the dropdown selected state
                DropDown(
                    text = "<- Insert your text here ->",
                    modifier = Modifier.padding(15.dp)
                ) {
                    Text(
                        text = "<- Text ->",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x0DF59))
                    )
                }

                Spacer(modifier = Modifier.size(16.dp))

                DropDown(
                    text = "<- Insert your text here ->",
                    modifier = Modifier.padding(15.dp)
                ) {
                    Text(
                        text = "<- Text ->",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x0DF59))
                    )
                }


            Spacer(modifier = Modifier.size(16.dp))


                DropDown(
                    text = "<- Insert your text here ->",
                    modifier = Modifier.padding(15.dp)
                ) {
                    Text(
                        text = "<- Text ->",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x0DF59))
                    )
                }

                Spacer(modifier = Modifier.size(16.dp))

                DropDown(
                    text = "<- Insert your text here ->",
                    modifier = Modifier.padding(15.dp)
                ) {
                    Text(
                        text = "<- Text ->",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x0DF59))
                    )
                }



            Spacer(modifier = Modifier.size(16.dp))

                DropDown(
                    text = "<- Insert your text here ->",
                    modifier = Modifier.padding(15.dp)
                ) {
                    Text(
                        text = "<- Text ->",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x0DF59))
                    )
                }

            Spacer(modifier = Modifier.size(16.dp))

                DropDown(
                    text = "<- Insert your text here ->",
                    modifier = Modifier.padding(15.dp)
                ) {
                    Text(
                        text = "<- Text ->",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x0DF59))
                    )
                }

            // make a function to randomize the order of the list then check my criteria

            // button to get suggestions
            //  make the text central
            Button(
                onClick = {
                    navController.navigate(Screen.SuggestedScreen.withArgs(cont))
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
                                Color.Blue,
                                Color.Cyan
                            )
                        ),
                        shape = RoundedCornerShape(15.dp)
                    )
                    .width(120.dp)
                    .height(50.dp)
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
                Text(text = "Get Suggestions", fontSize = 13.sp)
            }

            Spacer(modifier = Modifier.height(32.dp))

            // button to explore all of them
            Button(
                onClick = {
                    navController.navigate(Screen.ExploreScreen.withArgs(cont))
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
                                Color.Blue,
                                Color.Cyan
                            )
                        ),
                        shape = RoundedCornerShape(15.dp)
                    )
                    .width(120.dp)
                    .height(50.dp)
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
                Text(text = "Explore", fontSize = 13.sp)
            }

            Spacer(modifier = Modifier.size(32.dp))
            
            Text(text = "")

        }

    }
}
