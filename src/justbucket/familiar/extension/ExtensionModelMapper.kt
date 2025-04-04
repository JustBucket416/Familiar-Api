package justbucket.familiar.extension

import android.net.Uri
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.ListModel
import justbucket.familiar.extension.model.ShareModel

/**
 * An extendable class for creating models from JSON - either from the web or from local database
 *
 * @property extensionName Extension name. Should be overridden and kept unique and not null
 * across [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelMapper]
 *
 * @author JustBucket on 2019-07-22
 */
abstract class ExtensionModelMapper(val extensionName: String) {

    /**
     * Create a [ListModel] from json
     */
    abstract fun mapLocalToList(jsonString: String): ListModel

    /**
     * Create a json from [ListModel]
     */
    abstract fun mapListToLocal(model: ListModel): String

    /**
     * Create a [DetailModel] from json
     */
    abstract fun mapLocalToDetail(jsonString: String): DetailModel

    /**
     * Create a json from [DetailModel]
     */
    abstract fun mapDetailToLocal(model: DetailModel): String

    /**
     * Create a [ShareModel] from an [Intent]'s [Uri]
     */
    open fun createShareModel(uri: Uri): ShareModel? = null
}