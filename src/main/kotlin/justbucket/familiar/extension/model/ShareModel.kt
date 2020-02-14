package justbucket.familiar.extension.model

/**
 * An extendable model for saving content shared via intent
 * It is highly advised to override [equals]/[hashCode] in your subclass
 * 
 * @author JustBucket on 2019-07-22
 */
open class ShareModel(
    val extensionName: String = "",
    val title: String = ""
)