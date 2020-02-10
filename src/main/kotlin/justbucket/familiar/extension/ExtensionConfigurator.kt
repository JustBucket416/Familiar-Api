package justbucket.familiar.extension

import android.view.View
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.model.ShareModel

/**
 * @author JustBucket on 2019-07-22
 */
class ExtensionConfigurator {

    lateinit var extensionName: String

    fun configureMasterModel(view: View, model: MasterModel) {}

    fun configureDetailModel(detailView: View, model: DetailModel) {}

    fun configureShareModel(shareView: View, model: ShareModel, shareSaver: (ShareModel) -> Unit) {}
}