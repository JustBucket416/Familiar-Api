package justbucket.familiar.extension

import android.os.Bundle
import justbucket.familiar.extension.exception.Failure
import justbucket.familiar.extension.exception.Failure.FeatureFailure
import justbucket.familiar.extension.functional.Either
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.model.ShareModel

/**
 * An extendable class for creating models from JSON - either from the web or from local database
 * Api is subject to change
 *
 * @author JustBucket on 2019-07-22
 */
open class ExtensionModelCreator {

    /**
     * Extension name. Should be overridden and kept unique and not [null] across
     * [ExtensionConfigurator], [ExtensionLocator] and [ExtensionModelCreator]
     */
    lateinit var extensionName: String

    /**
     * Create [Either] a [MasterModel] from json or return a [Failure]
     * Default implementation returns [Failure]
     */
    fun createMasterModel(jsonString: String): Either<Failure, MasterModel> = Either.Left(FeatureFailure())

    /**
     * Create [Either] a [DetailModel] from json or return a [Failure]
     * Default implementation returns [Failure]
     */
    fun createDetailModel(jsonString: String): Either<Failure, DetailModel> = Either.Left(FeatureFailure())

    /**
     * Create [Either] a [ShareModel] from an Intent's extras or return a [Failure]
     * Default implementation returns [Failure]
     */
    fun createShareModel(shareDate: Bundle): Either<Failure, ShareModel> = Either.Left(FeatureFailure())
}