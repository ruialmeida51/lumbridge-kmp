package model

import androidx.compose.runtime.Composable
import com.eyther.lumbridge.shared.main.presentation.presentation.generated.resources.Res
import com.eyther.lumbridge.shared.main.presentation.presentation.generated.resources.bottom_nav_tab_home
import com.eyther.lumbridge.shared.main.presentation.presentation.generated.resources.bottom_nav_tab_tools
import com.eyther.lumbridge.shared.resources.ic_bolt
import com.eyther.lumbridge.shared.resources.ic_home
import navigation.MainHostDestination
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import com.eyther.lumbridge.shared.resources.Res as SharedRes

data class LoomBottomNavigationItem(
    val label: StringResource,
    val icon: DrawableResource,
    val destination: MainHostDestination
)

object LoomBottomNavigationItems {

    @Composable
    operator fun invoke(): List<LoomBottomNavigationItem> = listOf(
        LoomBottomNavigationItem(
            label = Res.string.bottom_nav_tab_home,
            icon = SharedRes.drawable.ic_home,
            destination = MainHostDestination.Home
        ),
        LoomBottomNavigationItem(
            label = Res.string.bottom_nav_tab_tools,
            icon = SharedRes.drawable.ic_bolt,
            destination = MainHostDestination.Tools
        )
    )
}
