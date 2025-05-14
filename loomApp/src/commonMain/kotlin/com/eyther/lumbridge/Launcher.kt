package com.eyther.lumbridge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.eyther.lumbridge.di.KoinHelper
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import screen.MainScreen
import theme.LocalAlpha
import theme.LocalColours
import theme.LocalPaddings
import theme.LocalTypography
import theme.colours.ThemeAlphaValues
import theme.colours.ThemeColours
import theme.dimensions.ThemePaddingValues
import theme.typography.ThemeStyles

@Composable
@Preview
fun AppLauncher() {
    KoinHelper.initKoin()

    KoinContext {
        CompositionLocalProvider(
            // If there's another app consuming the shared part, customise these values as
            // needed.
            LocalColours provides ThemeColours(),
            LocalPaddings provides ThemePaddingValues(),
            LocalTypography provides ThemeStyles(),
            LocalAlpha provides ThemeAlphaValues()
        ) {
            MainScreen()
        }
    }
}