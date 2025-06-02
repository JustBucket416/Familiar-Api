package justbucket.familiar.extension.library

import android.content.Context
import androidx.compose.runtime.Composable
import justbucket.familiar.extension.library.model.DetailModel
import justbucket.familiar.extension.library.model.ListModel

/**
 * @author JustBucket on 03.04.2025
 */
abstract class ExtensionSettings(val extensionName: String) {

    lateinit var extensionContext: Context

    abstract val isInitialized: Boolean

    @Composable
    abstract fun SettingsScreen(callbacks: SettingsCallbacks)

    interface SettingsCallbacks {

        fun saveModels(models: List<Triple<ListModel, DetailModel?, List<String>>>)
    }

}