package justbucket.familiar.extension.model

/**
 * An extendable model for master view
 * It is highly advised to override [equals]/[hashCode] in your subclass
 *
 * @constructor creates an instance of [DetailModel]
 * @property id should not be assigned
 * @property extensionName name of extension
 * @property imageLink path to the image in master view
 * @property title content title
 * @property description content description
 * @property detailViewLink url to detail information
 *
 * @author JustBucket on 2019-07-22
 */
open class MasterModel(
    open val id: Long,
    open val extensionName: String = "",
    open val imageLink: String = "",
    open val title: String = "",
    open val description: String = "",
    open val detailViewLink: String? = null
)