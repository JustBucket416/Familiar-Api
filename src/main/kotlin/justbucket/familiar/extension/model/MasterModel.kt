package justbucket.familiar.extension.model

/**
 * An extendable model for master view
 * It is highly advised to override [equals]/[hashCode] in your subclass
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