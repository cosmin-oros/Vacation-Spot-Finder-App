package cosmin.dev.travelapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cosmin.dev.travelapp.navigation.Screen

@Composable
fun CountriesScreen(navController: NavController, name: String?) {
    if (name != null) {
        Text(text = name)
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
}