package com.eyther.lumbridge.di

import SharedKoinComponent
import org.koin.core.context.startKoin

object KoinHelper {
    fun initKoin() {
        startKoin {
            modules(
                SharedKoinComponent()
            )
        }
    }
}