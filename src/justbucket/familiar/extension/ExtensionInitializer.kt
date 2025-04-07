package justbucket.familiar.extension

import android.content.Context
import androidx.compose.runtime.Composable
import justbucket.familiar.extension.model.ListModel

/**
 * @author JustBucket on 03.04.2025
 */
abstract class ExtensionInitializer(val extensionName: String) {

    lateinit var context: Context

    abstract val isInitialized: Boolean

    abstract val extensionInitializerScreen: @Composable (() -> Unit) -> Unit

    open fun getPreloadedModels(): List<Pair<ListModel, List<String>>> {
        return emptyList()
    }
}