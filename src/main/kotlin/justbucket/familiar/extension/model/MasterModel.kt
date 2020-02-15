package justbucket.familiar.extension.model

/**
 * An extendable model for master view
 * It is highly advised to override [equals]/[hashCode] in your subclass
 *
 * @constructor creates an instance of [DetailModel]
 * @property id should not be assigned
 * @property extensionName name of extension
 * @property imagePath path to the image in master view
 * @property title content title
 * @property description content description
 *
 * @author JustBucket on 2019-07-22
 */
open class MasterModel(
    val id: Long = -1,
    val extensionName: String = "",
    val imagePath: String = "",
    val title: String = "",
    val description: String = ""
)