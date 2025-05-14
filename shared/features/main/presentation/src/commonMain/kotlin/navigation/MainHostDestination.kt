package navigation

import kotlinx.serialization.Serializable

sealed interface MainHostDestination {
    @Serializable
    data object Home : MainHostDestination

    @Serializable
    data object Tools : MainHostDestination

    @Serializable
    data object Profile : MainHostDestination

    @Serializable
    data object Expenses : MainHostDestination
}
