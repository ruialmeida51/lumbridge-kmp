import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import navigation.HomeHostDestination
import screen.HomeScreen

@Composable
fun HomeHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = HomeHostDestination.Home,
    ) {
        composable<HomeHostDestination.Home> { HomeScreen() }
    }
}