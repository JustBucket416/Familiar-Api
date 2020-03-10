package justbucket.familiar.extension

import android.net.Uri
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.model.ShareModel

/**
 * An extendable class for creating models from JSON - either from the web or from local database
 * Api is subject to change
 *
 * @property extensionName Extension name. Should be overridden and kept unique and not [null]
 * across [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelMapper]
 *
 * @author JustBucket on 2019-07-22
 */
open class ExtensionModelMapper(val extensionName: String) {

    /**
     * Create a [MasterModel] from json
     */
    open fun mapRemoteToMaster(jsonString: String): MasterModel? =
        null //((String) -> MasterModel)? = null

    /**
     * Create a [MasterModel] from json
     */
    open fun mapLocalToMaster(jsonString: String): MasterModel? =
        null //((String) -> MasterModel)? = null

    /**
     * Create a [MasterModel] from json
     */
    open fun mapMasterToLocal(masterModel: MasterModel): String? =
        null //((MasterModel) -> String)? = null

    /**
     * Create a [DetailModel] from json
     */
    open fun mapRemoteToDetail(jsonString: String): DetailModel? =
        null //((String) -> DetailModel)? = null

    /**
     * Create a [DetailModel] from json
     */
    open fun mapLocalToDetail(jsonString: String): DetailModel? =
        null //((String) -> DetailModel)? = null

    /**
     * Create a [DetailModel] from json
     */
    open fun mapDetailToLocal(detailModel: DetailModel): String? =
        null //((DetailModel) -> String)? = null

    /**
     * Create a [ShareModel] from an [Intent]'s [Uri]
     */
    open fun createShareModel(uri: Uri): ShareModel? = null //((Bundle) -> ShareModel)? = null
}