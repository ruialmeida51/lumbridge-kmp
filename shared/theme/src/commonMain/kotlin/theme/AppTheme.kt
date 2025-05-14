package theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import theme.colours.ThemeAlphaValues
import theme.colours.ThemeColours
import theme.dimensions.ThemePaddingValues
import theme.typography.ThemeStyles

/**
 * A collection of colours that can be used to style a composable.
 */
val LocalColours: ProvidableCompositionLocal<ThemeColours> =
    staticCompositionLocalOf {
        error("LocalPaddings not initialized")
    }

/**
 * A collection of typography styles that can be used to stylise the text of a composable.
 */
val LocalTypography: ProvidableCompositionLocal<ThemeStyles> =
    staticCompositionLocalOf {
        error("LocalPaddings not initialized")
    }

/**
 * A collection of alpha values that can be used to adjust the perceived throughness of
 * composable elements. Useful, for example, to enable/disable composables.
 */
val LocalAlpha: ProvidableCompositionLocal<ThemeAlphaValues> =
    staticCompositionLocalOf {
        error("LocalAlpha not initialized")
    }

/**
 * A collection of standardised paddings that can be used to adjust the spacing between
 * composable elements.
 */
val LocalPaddings: ProvidableCompositionLocal<ThemePaddingValues> =
    staticCompositionLocalOf {
        error("LocalPaddings not initialized")
    }

object AppTheme {
    val themeColours: ThemeColours
        @Composable
        @ReadOnlyComposable
        get() = LocalColours.current

    val themeStyles: ThemeStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val loomAlpha: ThemeAlphaValues
        @Composable
        @ReadOnlyComposable
        get() = LocalAlpha.current

    val loomPadding: ThemePaddingValues
        @Composable
        @ReadOnlyComposable
        get() = LocalPaddings.current
}

