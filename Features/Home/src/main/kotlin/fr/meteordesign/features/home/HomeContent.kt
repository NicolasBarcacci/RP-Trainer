package fr.meteordesign.features.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
internal fun HomeContent(
    state: HomeState,
) {
    Text(text = "HomeScreen")
}

@Preview
@Composable
private fun Preview() {
    HomeContent(HomeState)
}
