package navigation

import kotlinx.serialization.Serializable

sealed interface HomeHostDestination {

    @Serializable
    data object Home : HomeHostDestination
}