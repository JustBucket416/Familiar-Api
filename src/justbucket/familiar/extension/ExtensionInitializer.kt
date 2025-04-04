package justbucket.familiar.extension

import android.content.Context
import androidx.compose.runtime.Composable

/**
 * @author JustBucket on 03.04.2025
 */
abstract class ExtensionInitializer {

    lateinit var context: Context

    abstract val isInitialized: Boolean

    abstract val extensionInitializerScreen: @Composable () -> Unit
}