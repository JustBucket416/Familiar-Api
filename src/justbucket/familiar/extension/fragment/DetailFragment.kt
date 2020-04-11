package justbucket.familiar.extension.fragment

import android.content.Context
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.resource.Resource

/**
 * Extend this class to properly configure your detail view.
 * _Do not use [LayoutInflater] in [onCreateView]! Get your inflater from fragment provider,
 * or views will be incorrectly inflated from xml_
 *
 * @author JustBucket on 2020-04-03
 */
open class DetailFragment : Fragment() {

    /**
     * Use this to get [LayoutInflater] and load your [DetailModel]
     */
    protected lateinit var fragmentProvider: FragmentProvider

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentProvider = context as FragmentProvider
    }

    /**
     * Used by Familiar's main activity to provide correct [LayoutInflater]
     * and [LiveData] which will receive [DetailModel] loading state updates
     */
    interface FragmentProvider {

        /**
         * Returns a [LayoutInflater] associated with your extension. Needs an [extensionName]
         * to correctly identify your extension
         */
        fun getThemedLayoutInflater(extensionName: String): LayoutInflater

        /**
         * Returns a [LiveData]'ish callbacks with [DetailModel] loading states. It needs [MasterModel]
         * which can be passed as [android.os.Parcelable]
         */
        fun loadDetailModel(masterModel: MasterModel): LiveData<Resource<DetailModel>>
    }
}