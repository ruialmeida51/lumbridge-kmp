@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

group = "com.eyther.lumbridge.shared.resources"
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
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
        }
    }
}

compose.resources {
    publicResClass = true
    packageOfResClass = "com.eyther.lumbridge.shared.resources"
    generateResClass = auto

}

android {
    namespace = "com.eyther.lumbridge.shared.resources"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
}
