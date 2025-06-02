package justbucket.familiar.extension.library

import android.content.Context
import androidx.compose.runtime.Composable
import justbucket.familiar.extension.library.model.DetailModel
import justbucket.familiar.extension.library.model.ListModel
import justbucket.familiar.extension.library.model.ShareModel

/**
 * An extendable class for handling how your content looks
 * Api is subject to change
 *
 * @property extensionName Extension name. Should be overridden and kept unique and not [null]
 * across [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelMapper]
 *
 * @author JustBucket on 2019-07-22
 */
abstract class ExtensionConfigurator<List : ListModel, Detail : DetailModel>(val extensionName: String) {

    lateinit var extensionContext: Context

    abstract val listModelConfigurator: (@Composable (List) -> Unit)?

    abstract val detailModelConfigurator: (@Composable (Detail) -> Unit)

    abstract val shareModelConfigurator: ShareModelConfig<List, Detail>?

}

typealias ShareModelConfig<ListModel, DetailModel> = (@Composable (ShareModel, (ListModel, DetailModel, List<String>) -> Unit) -> Unit)