package cosmin.dev.travelapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cosmin.dev.travelapp.ui.screens.continents_package.ContinentListItem
import cosmin.dev.travelapp.ui.screens.continents_package.ContinentsData
import cosmin.dev.travelapp.ui.screens.continents_package.ListOfContinents

@Composable
fun MainScreen(navController: NavController) {
    val continentsList = remember{
        ListOfContinents.getData()
    }

    //clickable continents
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = continentsList,
            itemContent = {
                ContinentListItem(continentsData = it, navController)
            }
        )
    }
}
