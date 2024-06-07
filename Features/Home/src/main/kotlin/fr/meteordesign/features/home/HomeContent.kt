package fr.meteordesign.features.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
internal fun HomeContent(
    state: HomeUiState,
) {
    val wordOfTheDay = remember { state.wordOfTheDay }
    WordOfTheDay(wordOfTheDay = wordOfTheDay)
}

@Composable
private fun WordOfTheDay(wordOfTheDay: UiWord?) {
    wordOfTheDay?.let {
        Text(text = wordOfTheDay.writing)
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
