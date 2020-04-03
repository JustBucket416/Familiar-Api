package justbucket.familiar.extension

import android.content.Context
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import justbucket.familiar.extension.fragment.DetailFragment
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
     * This context is used to inflate your xml files, e.g. layout resources via [LayoutInflater]
     * Do not use ViewGroup context or your attributes won't resolve
     */
    lateinit var themedAppContext: Context

    /**
     * Configure the main recycler's view holder
     * [parent] is view holder that you should inflate with data from [model]
     * Return `false` to if you want main app to configure content by default
     */
    open fun configureMasterModel(
        parent: ViewGroup,
        model: MasterModel
    ): Boolean {
        return false
    }

    /**
     * Configure the detail view of your content
     * Uses default [Fragment] mechanism with some peculiar additions, see [DetailFragment]
     */
    open fun configureDetailModel(masterModel: MasterModel): DetailFragment? = null

    /**
     * Configure the dialog when saving your shared content
     * [parent] is dialog to that you should inflate with data from [model]
     * invoke [saveClickListener] to save your model
     * Return `false` to if you want main app to configure content by default
     */
    open fun configureShareModel(
        parent: ViewGroup,
        model: ShareModel,
        saveClickListener: (ShareModel) -> Unit
    ): Boolean {
        return false
    }
}