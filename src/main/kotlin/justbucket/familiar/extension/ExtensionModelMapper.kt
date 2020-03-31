package justbucket.familiar.extension

import android.net.Uri
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.model.ShareModel

/**
 * An extendable class for creating models from JSON - either from the web or from local database
 * Api is subject to change
 *
 * @property extensionName Extension name. Should be overridden and kept unique and not null]
 * across [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelMapper]
 *
 * @author JustBucket on 2019-07-22
 */
open class ExtensionModelMapper(val extensionName: String) {

    /**
     * Create a [MasterModel] from json
     */
    open suspend fun mapRemoteToMaster(jsonString: String): MasterModel? = null

    /**
     * Create a [MasterModel] from json
     */
    open suspend fun mapLocalToMaster(id: Long, jsonString: String): MasterModel? = null

    /**
     * Create a json from [MasterModel]
     */
    open suspend fun mapMasterToLocal(masterModel: MasterModel): String? = null

    /**
     * Create a [DetailModel] from json
     */
    open suspend fun mapRemoteToDetail(jsonString: String): DetailModel? = null

    /**
     * Create a [DetailModel] from json
     */
    open suspend fun mapLocalToDetail(jsonString: String): DetailModel? = null

    /**
     * Create a json from [DetailModel]
     */
    open suspend fun mapDetailToLocal(detailModel: DetailModel): String? = null

    /**
     * Create a [ShareModel] from an [Intent]'s [Uri]
     */
    open fun createShareModel(uri: Uri): ShareModel? = null
}