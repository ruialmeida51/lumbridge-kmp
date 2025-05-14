import org.koin.core.module.Module
import presentation.MainModule

/**
 * Koin component for shared modules.
 *
 * Here we have to declare all shared modules for them be consumed by our app Launcher.
 */
data object SharedKoinComponent {
    operator fun invoke (): List<Module> {
        return MainModule()
    }
}