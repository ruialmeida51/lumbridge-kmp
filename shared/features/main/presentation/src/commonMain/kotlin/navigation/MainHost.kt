package navigation

import HomeHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import navigation.MainHostDestination.Expenses
import navigation.MainHostDestination.Home
import navigation.MainHostDestination.Profile
import navigation.MainHostDestination.Tools

@Composable
fun MainHost(
    modifier: Modifier,
    navHostController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = Home
    ) {
        composable<Home> { HomeHost() }
        composable<Tools> { }
        composable<Expenses> { }
        composable<Profile> { }
    }
}
