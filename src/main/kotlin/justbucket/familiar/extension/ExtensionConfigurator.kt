package justbucket.familiar.extension

import android.view.View
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.model.ShareModel

/**
 * An extendable class for handling how your content looks
 * Api is subject to change
 *
 * @property extensionName Extension name. Should be overridden and kept unique and not [null]
 * across [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelMapper]
 *
 * @author JustBucket on 2019-07-22
 */
open class ExtensionConfigurator(val extensionName: String) {

    /**
     * Configure the main recycler's view holder
     */
    open fun configureMasterModel(): ((View, MasterModel) -> Unit)? = null

    /**
     * Configure the detail view of your content
     */
    open fun configureDetailModel(): ((View, DetailModel) -> Unit)? = null

    /**
     * Configures the dialog when saving your shared content
     */
    open fun configureShareModel(): ((View, ShareModel, (ShareModel) -> Unit) -> Unit)? = null
}