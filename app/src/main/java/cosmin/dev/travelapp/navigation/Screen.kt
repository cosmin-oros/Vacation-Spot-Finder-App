package cosmin.dev.travelapp.navigation

const val MACROS_ARGUMENT_KEY = "id"

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object MainScreen: Screen("main_screen")
    object CountriesScreen: Screen("countries_screen")
    object CitiesScreen: Screen("cities_screen")
    object ExploreScreen: Screen("explore_screen")
    object SuggestedScreen: Screen("suggested_screen")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
    }
}