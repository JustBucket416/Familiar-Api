package justbucket.familiar.extension

import android.view.ViewGroup
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
    open fun configureMasterModel(): ((ViewGroup, MasterModel) -> Unit)? = null

    /**
     * Configure the detail view of your content
     */
    open fun configureDetailModel(): ((ViewGroup, DetailModel) -> Unit)? = null

    /**
     * Configures the dialog when saving your shared content
     */
    open fun configureShareModel(): ((ViewGroup, ShareModel, (ShareModel) -> Unit) -> Unit)? = null
}