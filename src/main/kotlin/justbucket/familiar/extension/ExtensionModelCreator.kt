package justbucket.familiar.extension

import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.model.ShareModel

/**
 * @author JustBucket on 2019-07-22
 */
class ExtensionModelCreator {

    lateinit var extensionName: String

    fun createMasterModel(jsonString: String): MasterModel = MasterModel()

    fun createDetailModel(jsonString: String): DetailModel = DetailModel()

    fun createShareModel(shareDate: String): ShareModel = ShareModel()
}