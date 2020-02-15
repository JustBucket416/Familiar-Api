package justbucket.familiar.extension.model

/**
 * An extendable model for the detailed content screen.
 * It is highly advised to override [equals]/[hashCode] in your subclass
 *
 * @constructor creates an instance of [DetailModel]
 * @property imagePath path to any image in detail view
 * @property title detail view title
 * @property description detail view description
 *
 * @author JustBucket on 2019-07-22
 */
open class DetailModel(
    val imagePath: String = "",
    val title: String = "",
    val description: String = ""
)