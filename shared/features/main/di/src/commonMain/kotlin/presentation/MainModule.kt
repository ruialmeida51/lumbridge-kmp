package presentation

import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import viewmodel.MainScreenViewModel

data object MainModule {

    private val presentationModule = module {
        viewModel { MainScreenViewModel() }
    }

    private val dataModule = module {

    }

    private val domainModule = module {

    }

    operator fun invoke(): List<Module> = listOf(
        presentationModule,
        dataModule,
        domainModule
    )
}
