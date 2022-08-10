package cosmin.dev.travelapp.navigation

const val MACROS_ARGUMENT_KEY = "id"

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object MainScreen: Screen("main_screen")
}