package justbucket.familiar.extension.library

import android.content.Intent
import android.net.Uri
import justbucket.familiar.extension.library.model.DetailModel
import justbucket.familiar.extension.library.model.ListModel
import justbucket.familiar.extension.library.model.ShareModel

/**
 * An extendable class for creating models from JSON - either from the web or from local database
 *
 * @property extensionName Extension name. Should be overridden and kept unique and not null
 * across [justbucket.familiar.extension.library.ExtensionConfigurator], [justbucket.familiar.extension.library.ExtensionLocator] and [ExtensionModelMapper]
 *
 * @author JustBucket on 2019-07-22
 */
abstract class ExtensionModelMapper(val extensionName: String) {

    /**
     * Create a [ListModel] from json
     */
    abstract fun mapLocalToList(id: Long, name: String, modelContent: ByteArray): ListModel

    /**
     * Create a json from [ListModel]
     */
    abstract fun mapListToLocal(model: ListModel): ByteArray

    /**
     * Create a [DetailModel] from json
     */
    abstract fun mapLocalToDetail(modelContent: ByteArray): DetailModel

    /**
     * Create a json from [DetailModel]
     */
    abstract fun mapDetailToLocal(model: DetailModel): ByteArray

    /**
     * Create a [ShareModel] from an [Intent]'s [Uri]
     */
    open fun createShareModel(intent: Intent): ShareModel {
        throw NotImplementedError()
    }
}