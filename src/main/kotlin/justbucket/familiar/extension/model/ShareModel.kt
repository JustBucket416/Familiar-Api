package justbucket.familiar.extension.model

/**
 * An extendable model for saving content shared via intent
 * It is highly advised to override [equals]/[hashCode] in your subclass
 *
 * @constructor creates an instance of [ShareModel]
 * @property extensionName name of extension
 * @property title name of sharing content
 * 
 * @author JustBucket on 2019-07-22
 */
open class ShareModel(
    open val extensionName: String = "",
    open val title: String = ""
)