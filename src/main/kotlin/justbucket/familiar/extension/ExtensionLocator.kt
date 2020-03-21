package justbucket.familiar.extension

import android.content.Context
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel

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
     * An application [Context] for content locating purposes
     */
    lateinit var context: Context

    /**
     * Searches somewhere by given query and returns a [Set] of [MasterModel]s
     * Default implementation returns [null]
     */
    open suspend fun getMasterForSearch(query: String): Set<MasterModel> = emptySet()

    /**
     * Returns a [DetailModel] for a given [MasterModel],
     * derived from search (that is, not yet saved)
     */
    open suspend fun getDetailsForSearch(masterModel: MasterModel): DetailModel = DetailModel(
        imageLink = masterModel.imageLink,
        title = masterModel.title,
        description = masterModel.description
    )
}
