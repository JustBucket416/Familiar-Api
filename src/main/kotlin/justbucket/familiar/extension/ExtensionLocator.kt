package justbucket.familiar.extension

import justbucket.familiar.extension.exception.Failure
import justbucket.familiar.extension.exception.Failure.FeatureFailure
import justbucket.familiar.extension.functional.Either
import justbucket.familiar.extension.model.DetailModel
import justbucket.familiar.extension.model.MasterModel
import justbucket.familiar.extension.model.ShareModel

/**
 * @author JustBucket on 2019-07-24
 */
class ExtensionLocator {

    lateinit var extensionName: String

    fun getMasterForSearch(query: String): Either<Failure, Set<MasterModel>> = Either.Left(FeatureFailure())

    fun getDetailsForSearch(masterModel: MasterModel): Either<FeatureFailure, DetailModel> =
        Either.Left(FeatureFailure())

    fun getMasterForShare(shareModel: ShareModel): Either<FeatureFailure, MasterModel> = Either.Left(FeatureFailure())

    fun getDetailsForShare(shareModel: ShareModel): Either<FeatureFailure, DetailModel> = Either.Left(FeatureFailure())
}