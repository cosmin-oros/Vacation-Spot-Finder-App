package cosmin.dev.travelapp.ui.screens.continents_package

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cosmin.dev.travelapp.navigation.Screen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ContinentListItem(continentsData: ContinentsData, navController: NavController) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.DarkGray,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        onClick = {
            //need to pass an argument to know what continent its on
            navController.navigate(Screen.CountriesScreen.withArgs(continentsData.continentName))
        }
    ){
        Row {
            ContinentImage(continentsData = continentsData)

            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = continentsData.continentName, style = typography.h6)
                Text(text = continentsData.info, style = typography.caption)
            }

        }
    }
}