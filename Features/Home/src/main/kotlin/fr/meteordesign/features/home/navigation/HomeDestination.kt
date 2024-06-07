package fr.meteordesign.features.home.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fr.meteordesign.features.home.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
data object HomeDestination

fun NavGraphBuilder.homeComposable() {
    composable<HomeDestination> {
        HomeScreen(viewModel = hiltViewModel())
    }
}
