package fr.meteordesign.data.words.datasource.local

import fr.meteordesign.data.words.R
import fr.meteordesign.data.words.datasource.local.model.DictionaryLocalRepoModel
import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.libraries.jsonParser.JsonParser
import fr.meteordesign.pratik.tools.RawFileReader
import javax.inject.Inject

internal class DictionaryLocalDataSourceImpl @Inject constructor(
    private val rawFileReader: RawFileReader,
    private val jsonParser: JsonParser,
) : DictionaryLocalDataSource {

    override fun getDictionary(): Result<DictionaryLocalRepoModel, Unit> {
        val json = rawFileReader.read(R.raw.dictionary)
        return jsonParser.toObject<DictionaryLocalRepoModel>(json)?.let {
            Result.Success(it)
        } ?: Result.Failure(Unit)
    }
}
