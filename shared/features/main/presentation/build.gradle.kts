@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.serialization)
}

group = "com.eyther.lumbridge.shared.main.presentation"
version = "1.0.0"

kotlin {
    // Declare all targets on which this module is capable of compiling

    // Android
    androidTarget()

    // Desktop on whatever runs a JVM
    jvm("desktop")

    // iOS
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    // Web
    wasmJs(configure = { browser() })

    sourceSets {
        commonMain.dependencies {
            implementation(project.dependencies.platform(libs.koin.bom))

            implementation(projects.shared.features.home.presentation)
            implementation(projects.shared.resources)
            implementation(projects.shared.theme)
            implementation(projects.shared.components)

            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)

            implementation(libs.androidx.compose.navigation)
            implementation(libs.koin.compose.viewmodel)
        }
    }

}

android {
    namespace = "com.eyther.lumbridge.shared.main.presentation"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
}
