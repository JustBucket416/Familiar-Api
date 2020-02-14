package justbucket.familiar.extension.model

/**
 * An extendable model for the detailed content screen.
 * It is highly advised to override [equals]/[hashCode] in your subclass
 *
 * @constructor creates an instance of [DetailModel]
 *
 * @author JustBucket on 2019-07-22
 */
open class DetailModel(
    /**
     * It is expected to have at least one image in detail view. [imagePath] is, namely, a path to that imahe
     */
    val imagePath: String = "",
    /**
     * Model title
     */
    val title: String = "",
    /**
     * Model description
     */
    val description: String = ""
)