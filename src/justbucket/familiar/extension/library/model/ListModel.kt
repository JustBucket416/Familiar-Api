package justbucket.familiar.extension.library.model

/**
 * An extendable model for list view
 *
 * @property extensionName name of extension
 * @property id do not assign
 * @property imageLink path to the image in master view
 * @property title content title
 * @property description content description
 * @property detailViewLink url to detail information
 *
 * @author JustBucket on 2019-07-22
 */
abstract class ListModel(
    open val extensionName: String,
    open var id: Long,
    open val imageLink: String = "",
    open val title: String = "",
    open val description: String = "",
    open val detailViewLink: String? = null
) {

    abstract override operator fun equals(other: Any?): Boolean

    abstract override fun hashCode(): Int

    abstract override fun toString(): String
}