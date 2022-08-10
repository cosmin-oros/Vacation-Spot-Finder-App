package cosmin.dev.travelapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cosmin.dev.travelapp.ui.screens.MainScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash_screen"){
        composable(Screen.SplashScreen.route) {
            /*SplashScreen(navController = navController)*/
        }

        composable(Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
    }
}