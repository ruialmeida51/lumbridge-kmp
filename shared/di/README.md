# shared:components

This module contains a collection of reusable Jetpack Compose components designed for use across various modules within the project. The goal is to promote consistency in UI design and accelerate development by providing readily available building blocks.

## Purpose

The primary purpose of this module is to centralize common UI elements that are used repeatedly throughout the application. This includes, but is not limited to:

*   **Basic UI elements:** Standard buttons, text fields, checkboxes, etc., with consistent styling and behavior.
*   **Complex components:** More elaborate composite components like custom dialogs, lists with specific item layouts, or navigation elements.
*   **Theming elements:** Definitions for colors, typography, shapes, and other theme-related constants used in the components.

By maintaining these components in a single, shared module, we ensure a consistent look and feel, reduce code duplication, and simplify maintenance.

## How to Use

To use the components defined in this module, simply add a dependency to your target module's `build.gradle.kts` file:

kotlin dependencies { implementation(project(":shared:components")) }

Once the dependency is added, you can import and use the components in your Composable functions.