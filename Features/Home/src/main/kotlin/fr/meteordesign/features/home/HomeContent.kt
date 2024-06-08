package fr.meteordesign.features.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import fr.meteordesign.features.home.models.PhoneticTranscriptionUiModel
import fr.meteordesign.features.home.models.WordUiModel

@Composable
internal fun HomeContent(
    state: HomeUiState,
) {
    val wordOfTheDay = remember { state.wordOfTheDay }
    WordOfTheDay(wordOfTheDay = wordOfTheDay)
}

@Composable
private fun WordOfTheDay(wordOfTheDay: WordUiModel?) {
    wordOfTheDay?.let {
        Column {
            Text(text = wordOfTheDay.writing)
            when (val phoneticTranscription = wordOfTheDay.phoneticTranscription) {
                is PhoneticTranscriptionUiModel.Strong -> {
                    Column {
                        phoneticTranscription.strongIpaWordList.forEach {
                            Text(text = it)
                        }
                    }
                }

                is PhoneticTranscriptionUiModel.StrongWeak -> {
                    Row {
                        Column {
                            phoneticTranscription.weakIpaWordList.forEach {
                                Text(text = it)
                            }
                        }
                        Column {
                            phoneticTranscription.strongIpaWordList.forEach {
                                Text(text = it)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    HomeContent(
        HomeUiState(
            wordOfTheDay = null,
        )
    )
}
