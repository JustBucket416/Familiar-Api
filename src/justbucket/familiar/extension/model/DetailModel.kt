package justbucket.familiar.extension.model

/**
 * An extendable model for the detailed content screen.
 * It is highly advised to override [equals]/[hashCode] in your subclass
 *
 * @constructor creates an instance of [DetailModel]
 * @property extensionName name of extension
 * @property title detail view title
 * @property imageLink path to any image in detail view
 * @property description detail view description
 *
 * @author JustBucket on 2019-07-22
 */
open class DetailModel(
    open val extensionName: String = "",
    open val title: String = "",
    open val imageLink: String = "",
    open val description: String = ""
)