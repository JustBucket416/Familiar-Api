package justbucket.familiar.extension

import android.content.Context
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.ListModel

/**
 * An extendable class for locating your content
 * Api is subject to change
 *
 * @property extensionName Extension name. Should be overridden and kept unique and not [null]
 * across [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelMapper]
 *
 * @author JustBucket on 2019-07-24
 */
open class ExtensionLocator(val extensionName: String) {
    /**
     * An application [Context] for content locating
     */
    lateinit var context: Context

    /**
     * Searches somewhere by given query and returns a [Set] of [ListModel]s
     * Default implementation returns empty list
     */
    open suspend fun getListModelsForSearch(query: String): List<ListModel> = emptyList()

    /**
     * Returns a [DetailModel] for a given [ListModel],
     * derived from search (that is, not yet saved)
     */
    open suspend fun getDetailsForSearch(listModel: ListModel) = DetailModel(
        extensionName = listModel.extensionName,
        imageLink = listModel.imageLink,
        title = listModel.title,
        description = listModel.description
    )
}
