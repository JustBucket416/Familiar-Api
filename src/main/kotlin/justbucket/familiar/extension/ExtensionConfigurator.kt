package justbucket.familiar.extension

import android.view.View
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.model.ShareModel

/**
 * An extendable class for handling how your content looks
 * Api is subject to change
 *
 * @author JustBucket on 2019-07-22
 */
open class ExtensionConfigurator {

    /**
     * Extension name. Should be overridden and kept unique and not [null] across
     * [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelCreator]
     */
    lateinit var extensionName: String

    /**
     * Configure the main recycler's view holder
     */
    fun configureMasterModel(view: View, model: MasterModel) {}

    /**
     * Configure the detail view of your content
     */
    fun configureDetailModel(detailView: View, model: DetailModel) {}

    /**
     * Configures the dialog when saving your shared content
     */
    fun configureShareModel(shareView: View, model: ShareModel, shareSaver: (ShareModel) -> Unit) {}
}