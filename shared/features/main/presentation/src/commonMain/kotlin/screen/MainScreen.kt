package screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import model.LoomBottomNavigationItem
import model.LoomBottomNavigationItems
import navigation.MainHost
import navigation.MainHostDestination
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import theme.AppTheme.loomAlpha
import theme.AppTheme.loomPadding

@Composable
fun MainScreen() {
    val navHostController = rememberNavController()
    val items = LoomBottomNavigationItems()
    var currentTab by remember { mutableStateOf<MainHostDestination>(MainHostDestination.Home) }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .imePadding()
            .systemBarsPadding(),
        bottomBar = {
            BottomNavigation {
                items.forEachIndexed { index, item ->
                    Spacer(
                        modifier = Modifier.width(loomPadding.halfPadding)
                    )

                    createItem(
                        item = item,
                        selected = currentTab == item.destination,
                        onClick = {
                            currentTab = item.destination

                            navHostController.navigate(item.destination) {
                                popUpTo(navHostController.graph.findStartDestination().id) {
                                    saveState = true
                                }

                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )

                    if (index == items.lastIndex) {
                        Spacer(
                            modifier = Modifier.width(loomPadding.halfPadding)
                        )
                    }
                }
            }
        }
    ) { paddingValues ->
        MainHost(
            modifier = Modifier.padding(paddingValues),
            navHostController = navHostController
        )
    }
}

@Composable
private fun RowScope.createItem(
    item: LoomBottomNavigationItem,
    selected: Boolean,
    onClick: () -> Unit
) {
    BottomNavigationItem(
        icon = {
            Icon(
                modifier = Modifier
                    .alpha(
                        if (selected) {
                            loomAlpha.enabled
                        } else {
                            loomAlpha.disabled
                        }
                    ),
                painter = painterResource(item.icon),
                contentDescription = null
            )
        },
        selected = selected,
        label = {
            Text(
                modifier = Modifier
                    .alpha(
                        if (selected) {
                            loomAlpha.enabled
                        } else {
                            loomAlpha.disabled
                        }
                    )
                    .align(Alignment.Bottom),
                text = stringResource(item.label)
            )
        },
        onClick = onClick
    )
}
