package justbucket.familiar.extension.resource

/**
 * Resource state wrapper which has 3 states:
 * [Loading] which represents loading state
 * [Success] which represents loaded state. It contains loaded data
 * [Error] which meant that an error has occurred. It contains an error message
 *
 * @param T the data type
 *
 * @author JustBucket on 2019-07-15
 */
sealed class Resource<out T> {

    class Loading<out T> : Resource<T>()

    data class Success<out T>(val data: T) : Resource<T>()

    data class Error<out T>(val errorMessage: String) : Resource<T>()
}