package justbucket.familiar.extension

import justbucket.familiar.extension.exception.Failure
import justbucket.familiar.extension.exception.Failure.FeatureFailure
import justbucket.familiar.extension.functional.Either
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel

/**
 * An extendable class for locating your content
 * Api is subject to change
 *
 * @author JustBucket on 2019-07-24
 */
open class ExtensionLocator {

    /**
     * Extension name. Should be overridden and kept unique and not [null] across
     * [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelCreator]
     */
    lateinit var extensionName: String

    /**
     * Searches somewhere by given query and returns [Either] a [Failure] or a [Set] of [MasterModel]s
     * Default implementation returns [Failure]
     */
    fun getMasterForSearch(query: String): Either<Failure, Set<MasterModel>> = Either.Left(FeatureFailure())

    /**
     * Returns [Either] a [Failure] or a [DetailModel] for a given [MasterModel],
     * derived from search (that is, not yet saved)
     */
    fun getDetailsForSearch(masterModel: MasterModel): Either<FeatureFailure, DetailModel> =
            Either.Left(FeatureFailure())
}