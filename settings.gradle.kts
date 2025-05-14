@file:Suppress("UnstableApiUsage")

include(":shared:theme")


include(":shared:resources")


//rootProject.name = "LoomApp"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(
    ":loomApp",
    ":shared",
    ":shared:core",
    ":shared:components",
    ":shared:analytics",
    ":shared:di",
    ":shared:features",

    ":shared:features:home",
    ":shared:features:home:presentation",
    ":shared:features:home:domain",
    ":shared:features:home:data",

    ":shared:features:main",
    ":shared:features:main:presentation",
    ":shared:features:main:domain",
    ":shared:features:main:data",
    ":shared:features:main:di",
)
