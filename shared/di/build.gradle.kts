@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

group = "com.eyther.lumbridge.shared.di"
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
            implementation(projects.shared.features.main.di)
            implementation(project.dependencies.platform(libs.koin.bom))
            implementation(libs.koin.core)
        }
    }

}

android {
    namespace = "com.eyther.lumbridge.shared.di"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
}
