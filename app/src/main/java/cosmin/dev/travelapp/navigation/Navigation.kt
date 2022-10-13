package cosmin.dev.travelapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import cosmin.dev.travelapp.ui.screens.*

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash_screen"){
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }

        composable(Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }

        composable(
            Screen.CountriesScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    //defaultValue
                    nullable = true
                }
            )
        ) { entry ->
            CountriesScreen(navController = navController, name = entry.arguments?.getString("name"))
        }

        composable(
            Screen.CitiesScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    //defaultValue
                    nullable = true
                }
            )
        ) { entry ->
            CitiesScreen(navController = navController, name = entry.arguments?.getString("name"))
        }

        composable(
            Screen.ExploreScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    //defaultValue
                    nullable = true
                }
            )
        ) { entry ->
            ExploreScreen(navController = navController, name = entry.arguments?.getString("name"))
        }

        composable(
            Screen.SuggestedScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    //defaultValue
                    nullable = true
                }
            )
        ) { entry ->
            SuggestedScreen(navController = navController, name = entry.arguments?.getString("name"))
        }
    }
}